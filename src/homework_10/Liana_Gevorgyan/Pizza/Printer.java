package homework_10.Liana_Gevorgyan.Pizza;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();

        System.out.println("Order : " + order.getNumber());
        System.out.println("Client: " + order.getCustomerId());

        for(int i = 0; i< order.getProductsQty(); i++){
            Product currentProduct=order.getProducts()[i];

            System.out.println("Name : " + currentProduct.getName());
            trainlingLine();
            System.out.println(currentProduct.getPrintableString());
            trainlingLine();

            System.out.println("Amount: " + currentProduct.calculatePrice() + "$");
            System.out.println("Quantity: " + currentProduct.getQuantity());
            trainlingLine();

        }


        System.out.println("Total amount: " + order.calculateOrderPrice() + "$");
        leadingLine();
    }

    public static void printSomething(IPrintable something) {
        something.print();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("------------------");
    }
}
