package homework_3.Gevorg_Martirosian.chapter_5;

import java.io.IOException;

//using do-while loop for presentation menu items
public class Menu {
    public static void main(String[] args) throws IOException {

        char choice;
        do {
            System.out.println("short information about: ");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for");
            System.out.println("choose the item");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println();

        switch (choice) {
            case '1':
                System.out.println("if operator:");
                System.out.println("if(condition) {");
                System.out.println("sequence of operators");
                System.out.println("}");
                System.out.println("else {");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '2':
                System.out.println("switch operator:");
                System.out.println("switch(expression) {");
                System.out.println("case constant:");
                System.out.println("sequence of operators");
                System.out.println("break;");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while loop:");
                System.out.println("while(condition) {");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '4':
                System.out.println("do-while loop:");
                System.out.println("do {");
                System.out.println("//...");
                System.out.println("}");
                System.out.println("while(condition);");
                break;
            case '5':
                System.out.println("for loop:");
                System.out.println("for(initialisation; condition; iteration) {");
                System.out.println("//...");
                System.out.println("}");
                break;
        }
    }
}
