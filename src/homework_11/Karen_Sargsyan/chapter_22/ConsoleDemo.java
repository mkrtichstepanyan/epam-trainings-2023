package homework_11.Karen_Sargsyan.chapter_22;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();
        if (con == null) {
            return;
        }
        str = con.readLine("Enter a string: ");
        con.printf("Here is your string: %s\n", str);
    }

}
