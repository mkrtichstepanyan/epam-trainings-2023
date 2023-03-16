package homework_11.garik_gharibyan.chapter_22.byte_array_inpu_stream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String text = "absdefghijklmnopqrstuvwxyz";
        byte[] bytes = text.getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(bytes,0,3);


    }
}
