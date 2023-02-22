package Shushanik_araqelyan_pizza;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        // printDelimiter
        trainlingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
