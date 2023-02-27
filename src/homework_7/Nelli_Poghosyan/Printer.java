package homework_7.Nelli_Poghosyan;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        order.printOrderNumberAndClientNumber();
        order.printPizzaAttributes();
        printDelimiter();
        order.printTotalPrice();
        trailingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    public static void trailingLine() {
        System.out.println("********************");
    }

    public static void printDelimiter(){
        System.out.println("-------------------------");
    }

}
