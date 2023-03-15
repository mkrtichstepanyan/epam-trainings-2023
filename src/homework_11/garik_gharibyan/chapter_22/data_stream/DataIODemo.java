package homework_11.garik_gharibyan.chapter_22.data_stream;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        try (DataOutputStream dout = new DataOutputStream(
                new FileOutputStream("src/homework_11/garik_gharibyan/chapter_22/data_stream/text.txt"));
        ) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);

        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }

        try(DataInputStream dio = new DataInputStream(
                new FileInputStream("src/homework_11/garik_gharibyan/chapter_22/data_stream/text.txt")
        )) {
            double d = dio.readDouble();
            int i = dio.readInt();
            boolean b = dio.readBoolean();

            System.out.println("Here are the values: " + d + " " + i + " " + b);
        }catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
