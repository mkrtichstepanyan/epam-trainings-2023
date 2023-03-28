package homework_11.Vahe_Vardanyan.chapter_13.buffer_readerr;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args)throws IOException {
        if (System.console() != null) {

            BufferedReader br = new BufferedReader
                    (new InputStreamReader(System.in
                            , System.console().charset()));

            String str;
            System.out.println("Enter Lines of text.");
            System.out.println("Enter 'stop' to quit.");
            do {
                str = br.readLine();
                System.out.println(str);
            } while (!str.equals("Stop"));
        }
    }
}
