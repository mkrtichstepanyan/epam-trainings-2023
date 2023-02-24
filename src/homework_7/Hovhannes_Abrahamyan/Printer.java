package homework_7.Hovhannes_Abrahamyan;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();

        System.out.println("Order : " + order.getNumber());
        System.out.println("Client: " + order.getCustomerId());

        for(int i= 0; i< order.getPizzasQuinty; i++){
            Pizza currentPizza =order.getPizzas()[i];

            System.out.println("Name : " + currentPizza.getName());
            trainlingLine();

            System.out.println("Pizza Base (" + currentPizza.getType()+ ") " + currentPizza.getBasePrice() + "$");
            for (int j= 0 ; j< currentPizza.getIngredineQty(); j++){
                Ingredient currentIngredient = currentPizza.getIngredients()[j];
                System.out.println(currentIngredient.getName() + " " + currentIngredient.getPrice() + "$");

            }
            trainlingLine();

            System.out.println("Amount: " + currentPizza.calculatePrice() + "$");
            System.out.println("Quantity: " + currentPizza.getQuantity());
            trainlingLine();

        }

        printDelimiter();
        order.printOrderAttributes();
        System.out.println("Total amount : " + order.calculateOrderPrice() + " $");
        trainlingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("--------------------");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}