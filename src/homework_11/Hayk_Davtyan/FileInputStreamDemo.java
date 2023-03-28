package homework_11.Hayk_Davtyan;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try(FileInputStream f = new FileInputStream("C:\\Users\\ASUS\\Desktop\\homefile.txt")){
            System.out.println(size = f.available());
            int n = size/40;
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println(f.available());
            byte[] b = new byte[n];
            if (f.read(b) != n){
                System.out.println(n + "byte");
            }
            System.out.println(new String(b,0,n));
            System.out.println(size = f.available());
            f.skip(size/2);
            System.out.println(f.available());
            System.out.println(n/2);
            if (f.read(b,n/2,n/2) != n/2){
                System.err.println(n/2);
            }
            System.out.println(new String(b,0,b.length));
            System.out.println(f.available());
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
