package JavaChat.number1_4_8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    // ключ - имя клиента, значение - соединение с ним
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(53)) {
            System.out.println("Сервер запущен на порту 53");
            while (true) {
                //Слушаем
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                //запускаем handler
                handler.start();
            }
        }
    }


    // отправка сообщения
    private static void sendMessage(Message message) {
        String name = null;
        boolean privateMsg = false;
        try {
            // проверяем на наличие @userName - приватное сообщение
            for (String temp : connectionMap.keySet()) {
                if(message.getData().contains("@" + temp)){
                    name = temp;
                    privateMsg = true;
                    break;
                }
            }
            // если приватное, то одному, иначе отправить всем
            if(privateMsg)
                connectionMap.get(name).send(message);
            else {
                for (Connection connection : connectionMap.values()) {
                    connection.send(message);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Сообщение не отправлено");
        }
    }

    // обработчик Handler, в котором будет происходить обмен сообщениями с клиентом
    private static class Handler extends Thread {

        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {
            System.out.println("Установленно соединение с адресом " + socket.getRemoteSocketAddress());
            String clientName = null;

            // Создаем Connection
            try (Connection connection = new Connection(socket)) {
                // Выводить сообщение, что установлено новое соединение с удаленным адресом
                System.out.println("Подключение к порту: " + connection.getRemoteSocketAddress());
                // Знакомимся с клиентом
                clientName = serverHandshake(connection);
                // Рассылать всем участникам чата информацию об имени присоединившегося участника (сообщение с типом USER_ADDED)
                sendMessage(new Message(MessageType.USER_ADDED, clientName));
                // Сообщать новому участнику о существующих участниках
                sendListOfUsers(connection, clientName);
                // Отсылаем сонет
                sonet(connection, clientName);
                // Запускать главный цикл обработки сообщений сервером
                serverMainLoop(connection, clientName);

            } catch (IOException e) {
                System.out.println("Ошибка при обмене данными с удаленным адресом");
            } catch (ClassNotFoundException e) {
                System.out.println("Ошибка при обмене данными с удаленным адресом");
            }

            // После того как все исключения обработаны, удаляем запись из connectionMap
            connectionMap.remove(clientName);

            // и отправлялем сообщение остальным пользователям
            sendMessage(new Message(MessageType.USER_REMOVED, clientName));
            System.out.println("Соединение с удаленным адресом закрыто");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                // Сформировать и отправить команду запроса имени пользователя
                connection.send(new Message(MessageType.NAME_REQUEST));

                // Получить ответ клиента
                Message message = connection.receive();

                // Проверить, что получена команда с именем пользователя
                if (message.getType() == MessageType.USER_NAME) {

                    //Достать из ответа имя, проверить, что оно не пустое
                    if (message.getData() != null && !message.getData().isEmpty()) {

                        // и пользователь с таким именем еще не подключен (используй connectionMap)
                        if (connectionMap.get(message.getData()) == null) {

                            // Добавить нового пользователя и соединение с ним в connectionMap
                            connectionMap.put(message.getData(), connection);

                            // Отправить клиенту команду информирующую, что его имя принято
                            connection.send(new Message(MessageType.NAME_ACCEPTED));

                            // Вернуть принятое имя в качестве возвращаемого значения
                            return message.getData();
                        }
                    }
                }
            }
        }

        // Отправка списка всех пользователей
        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()) {
                Message message = new Message(MessageType.USER_ADDED, name);
                if (!name.equals(userName)) {
                    connection.send(message);
                }
            }
        }

        private static void sonet(Connection connection, String userName) throws IOException{
            SecureRandom random = new SecureRandom();
            int[] sonetAr = {1, 18, 20, 36, 38, 55, 57, 75, 77, 94};
            int tempRand = random.nextInt(8);
            if(tempRand % 2 != 0){
                tempRand++;
            }

            int counter = 0;

            List<String> file_strings = new ArrayList<>();

            File file = new File("src/JavaChat/number1_4_8/sheki.txt");
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String str;

                while((str = br.readLine()) != null) {
                    counter++;
                    if (counter > sonetAr[tempRand] - 1)
                        file_strings.add(str);
                    if (counter == sonetAr[tempRand + 1])
                        break;
                }

                for (String name : connectionMap.keySet()) {
                    if (name.equals(userName)) {
                        for(int i = 0; i < file_strings.size(); i++) {
                            Message message = new Message(MessageType.TEXT, file_strings.get(i));
                            connection.send(message);
                        }
                    }
                }

            } catch (FileNotFoundException e){
                System.out.println("no file");
            }
        }

        // Главный цикл обработки сообщений сервером
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                // Если принятое сообщение – это текст (тип TEXT)
                if (message.getType() == MessageType.TEXT) {
                    String s = userName + ": " + message.getData();
                    Message formattedMessage = new Message(MessageType.TEXT, s);
                    sendMessage(formattedMessage);
                } else {
                    System.out.println("Error");
                }
            }
        }
    }
}