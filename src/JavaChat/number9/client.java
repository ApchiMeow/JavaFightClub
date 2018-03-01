package JavaChat.number9;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;

public class client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 53);
        OutputStream outputStream = socket.getOutputStream();
        BufferedImage image = ImageIO.read(new File("src/JavaChat/number9/testfile1.jpg"));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", byteArrayOutputStream);

        byte[] size = ByteBuffer.allocate(4).putInt(byteArrayOutputStream.size()).array();
        outputStream.write(size);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.flush();
        System.out.println("Flushed: " + System.currentTimeMillis());
        System.out.println("Closing: " + System.currentTimeMillis());

        InputStream inputStream = socket.getInputStream();

        System.out.println("Reading: " + System.currentTimeMillis());

        byte[] sizeAr = new byte[4];
        inputStream.read(sizeAr);
        int sizeS = ByteBuffer.wrap(sizeAr).asIntBuffer().get();

        byte[] imageAr = new byte[sizeS];
        inputStream.read(imageAr);

        BufferedImage imageS = ImageIO.read(new ByteArrayInputStream(imageAr));

        System.out.println("Received " + image.getHeight() + "x" + image.getWidth() + ": " + System.currentTimeMillis());
        ImageIO.write(imageS, "jpg", new File("src/JavaChat/number9/testfile3.jpg"));
        socket.close();
    }
}
