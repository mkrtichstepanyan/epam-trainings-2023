package homework_10.Inesa_Mkrtchyan.Pizza;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Order : " + order.getOrderNumber());
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
            System.out.println("Amount - " + (p.calculatePrice()*p.quantity));
            System.out.println("Quantity - " + p.quantity);
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
