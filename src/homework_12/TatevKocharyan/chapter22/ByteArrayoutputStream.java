package homework_12.TatevKocharyan.chapter22;

import java.io.*;

public class ByteArrayoutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This should end up in the array";
        byte[] buf = s.getBytes();
        try {
            f.write(buf);
        } catch (Exception e) {
            System.out.println("Error writing to Buffer");
            return;
        }
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("into array");
        byte[] b = f.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("\n To a OutputStream()");
        try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Error writing to buffer");
            return;
        }
        System.out.println("Doing a reset");
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}