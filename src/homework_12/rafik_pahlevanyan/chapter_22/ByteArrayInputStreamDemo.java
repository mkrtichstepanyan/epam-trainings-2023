package homework_12.rafik_pahlevanyan.chapter_22;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "sdgfghjkgfhdghjgdfhghjhdfgn";
        byte[] b = tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
    }
}
