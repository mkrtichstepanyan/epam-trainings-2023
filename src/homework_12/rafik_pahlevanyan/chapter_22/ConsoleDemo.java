package homework_12.rafik_pahlevanyan.chapter_22;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;

        console = System.console();

        if (console == null) {
            return;
        }
        str = console.readLine("Enter a string: ");
        console.printf("Here is your string: %s\n", str);
    }
}
