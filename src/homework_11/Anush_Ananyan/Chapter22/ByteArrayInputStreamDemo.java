package homework_11.Anush_Ananyan.Chapter22;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstwxyz";
        byte[]b = tmp.getBytes();
        ByteArrayInputStream input1 =  new ByteArrayInputStream(b);
        ByteArrayInputStream input2 =  new ByteArrayInputStream(b, 0, 3);
    }
}
