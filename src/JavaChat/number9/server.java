package JavaChat.number9;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(53);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();

        System.out.println("Reading: " + System.currentTimeMillis());

        byte[] sizeAr = new byte[4];
        inputStream.read(sizeAr);
        int size = ByteBuffer.wrap(sizeAr).asIntBuffer().get();

        byte[] imageAr = new byte[size];
        inputStream.read(imageAr);

        BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageAr));

        System.out.println("Received " + image.getHeight() + "x" + image.getWidth() + ": " + System.currentTimeMillis());
        ImageIO.write(image, "jpg", new File("src/JavaChat/number9/testfile2.jpg"));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Передать файл клиентам?");
        int select = scanner.nextInt();
        OutputStream outputStream = socket.getOutputStream();
        BufferedImage imageS = ImageIO.read(new File("src/JavaChat/number9/testfile2.jpg"));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(imageS, "jpg", byteArrayOutputStream);

        byte[] sizeS = ByteBuffer.allocate(4).putInt(byteArrayOutputStream.size()).array();
        outputStream.write(sizeS);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.flush();
        System.out.println("Flushed: " + System.currentTimeMillis());
        Thread.sleep(120000);
        System.out.println("Closing: " + System.currentTimeMillis());

        scanner.close();

        serverSocket.close();
    }
}
