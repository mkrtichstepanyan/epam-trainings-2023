package homework_11.garik_gharibyan.chapter_22.byte_array_inpu_stream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String text = "abs";
        byte[] bytes = text.getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        for (int i = 0; i < 2; i++) {
            int read = byteArrayInputStream.read();
            while (read != -1){
                if (i == 0){
                    System.out.print((char) read);
                    read = byteArrayInputStream.read();
                }else {
                    System.out.print(Character.toUpperCase((char) read));
                    read = byteArrayInputStream.read();
                }
            }
            System.out.println();
            byteArrayInputStream.reset();


        }
    }
}
