package homework_7.Inesa_Mkrtchyan;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        //todo print logic goes here.
        // printDelimiter
        System.out.println("Order : " + order.getIndex());
        System.out.println("Client : " + order.getCustomer().getNumber());
        System.out.println("Name : " + order.getCustomer().getName());
        printProduct(order.getProducts());
        System.out.println("Total amount  " + order.calculateOrderPrice());

        trainlingLine();

    }
    private static void printProduct(Product[] products){
        printLine();
        for(Product p : products){
            p.printProductSpecialInfo();
            printIngredients(p.getIngredients());
            System.out.println("Amount - " + p.calculatePrice());
            printLine();
        }
    }
    private static void printIngredients(Ingredient ingredients[]){
        for(Ingredient i : ingredients){
            System.out.println(i.getName() + "   " + i.getPrice() + "$");
        }
    }
    private static void leadingLine() {
        System.out.println("********************");
    }
    private static void printLine(){
        System.out.println("-----------------------");
    }
    private static void trainlingLine() {
        System.out.println("********************");
    }
}
