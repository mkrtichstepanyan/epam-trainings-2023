package homework_12.rafik_pahlevanyan.chapter_22;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte[] b = tmp.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);

        for (int i = 0; i < 2; i++) {
            int c;
            while ((c = in.read()) != -1) {
                if (i == 0) {
                    System.out.println((char) c);
                } else {
                    System.out.println(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            in.reset();
        }
    }
}
