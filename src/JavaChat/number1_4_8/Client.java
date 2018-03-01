package JavaChat.number1_4_8;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {
// c
    private Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public void run() {
        // Создавать новый сокетный поток с помощью метода getSocketThread
        SocketThread socketThread = new SocketThread();
        // Помечать созданный поток как daemon, это нужно для того, чтобы при выходе
        // из программы вспомогательный поток прервался автоматически.
        socketThread.setDaemon(true);
        // Запустить вспомогательный поток
        socketThread.start();

        // Заставить текущий поток ожидать, пока он не получит нотификацию из другого потока
        try {
            synchronized (this) {
                this.wait();
            }
        } catch (InterruptedException e) {
            Console.write("Ошибка");
            return;
        }

        //После того, как поток дождался нотификации, проверяет значение clientConnected
        if (clientConnected) {
            Console.write("Соединение установлено.");
            // Считываем сообщения пока клиент подключен. Если введена команда 'exit', то выход из цикла
            while (clientConnected) {
                String message;
                if (!(message = Console.read()).equals("exit")) {
                        sendTextMessage(message);
                } else {
                    return;
                }
            }
        }
        else {
            Console.write("Произошла ошибка во время работы клиента.");
        }
    }

    // Запрашиваем ввод адреса сервера
    private String getServerAddress() {
        Console.write("Введите адрес сервера: ");
        return Console.read();
    }

    // Запрашиваем ввод порта
    private int getServerPort() {
        Console.write("Введите порт сервера: ");
        return Console.readInt();
    }

    //  создает новое текстовое сообщение, используя переданный текст и отправляет его серверу через соединение connection
    private void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            Console.write("Ошибка отправки");
            clientConnected = false;
        }
    }

    public class SocketThread extends Thread {
        public void run() {
            try {
                Socket socket = new Socket(getServerAddress(), getServerPort());

                Client.this.connection = new Connection(socket);

                clientHandshake(); // представляемся серверу
                clientMainLoop(); // обработка сообщений

            } catch (IOException e) {
                notifyConnectionStatusChanged(false);
            } catch (ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }
        }

        // Этот метод будет реализовывать главный цикл обработки сообщений сервера
        private void clientMainLoop() throws IOException, ClassNotFoundException {
            while (true) {
                // В цикле получать сообщения, используя соединение connection
                Message message = connection.receive();

                switch (message.getType()) {
                    case TEXT:
                        Console.write(message.getData()); // просто выводим
                        break;

                    case USER_ADDED: // Если USER_ADDED - message.getData() содержит имя
                        Console.write("участник " + message.getData() + " присоединился к чату");
                        break;

                    case USER_REMOVED:
                        Console.write("участник " + message.getData() + " покинул чат");
                        break;

                    default:
                        throw new IOException("Unexpected MessageType");
                }
            }
        }

        private void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                // В цикле получать сообщения, используя соединение connection
                Message message = connection.receive();

                switch (message.getType()) {
                    // 	Если тип полученного сообщения NAME_REQUEST (сервер запросил имя)
                    case NAME_REQUEST: {
                        // запросить ввод имени пользователя
                        // создать новое сообщение с типом USER_NAME и введенным именем, отправить сообщение серверу.
                        Console.write("Введите имя пользователя: ");
                        String userName = Console.read();
                        connection.send(new Message(MessageType.USER_NAME, userName));
                        break;
                    }

                    // Если тип полученного сообщения NAME_ACCEPTED (сервер принял имя)
                    case NAME_ACCEPTED: {
                        // значит сервер принял имя клиента, нужно об этом сообщить главному потоку
                        // Сделай это с помощью метода notifyConnectionStatusChanged(), передав в него true. После этого выйди из метода.
                        notifyConnectionStatusChanged(true);
                        return;
                    }

                    default: {
                        throw new IOException("Unexpected MessageType");
                    }
                }
            }
        }

        // Устанавливать значение поля clientConnected класса Client в соответствии с
        // переданным параметром. Оповещать (пробуждать ожидающий) основной поток класса Client
        private void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }
    }
}
