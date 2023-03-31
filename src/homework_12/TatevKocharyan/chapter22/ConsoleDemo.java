package homework_12.TatevKocharyan.chapter22;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;
        con = System.console();
        if (con == null) return;
        str = con.readLine("Enter a string: ");
        con.printf("Here is you string: %s\n", str);
    }
}