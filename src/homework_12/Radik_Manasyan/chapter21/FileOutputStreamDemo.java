package homework_12.Radik_Manasyan.chapter21;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                "to come to the aid of their contry\n" +
                "and pay their due texes.";
        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file1.txt");
            f2 = new FileOutputStream("file1.txt");

            for (int i = 0; i < buf.length; i+=2) {
                f0.write(buf[i]);

            }
            f1.write(buf);
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e) {
            System.out.println("Произашло ошибка ввода-вывода");
        } finally {
            try {
                if (f0 != null) {
                    f0.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файлф file1.txt");
            }

            try {
                if (f1 != null) {
                    f1.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файлф file2.txt");
            }

            try {
                if (f2 != null) {
                    f2.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файлф file3.txt");
            }
        }
    }
}
