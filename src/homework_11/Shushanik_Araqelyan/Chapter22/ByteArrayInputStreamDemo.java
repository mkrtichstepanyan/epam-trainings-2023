package homework_11.Shushanik_Araqelyan.Chapter22;

import homework_11.Roza_Petrosyan.chapter_22.byte_array_output_stream.ByteArrayOutputStreamDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdeghijklmnopqrstuvwxyz";
        byte[] b= tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);

    }
}
