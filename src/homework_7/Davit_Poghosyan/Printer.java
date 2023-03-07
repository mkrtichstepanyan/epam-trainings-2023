package homework_7.Davit_Poghosyan;
public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        order.printOrderNumberAndClientNumber();
        order.printPizzaAttributes();
        printDelimiter();
        order.printDrinkAttributes();
        order.printTotalPrice();
        trailingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trailingLine() {
        System.out.println("********************");
    }

    public static void printDelimiter(){
        System.out.println("-------------------------");
    }

}
