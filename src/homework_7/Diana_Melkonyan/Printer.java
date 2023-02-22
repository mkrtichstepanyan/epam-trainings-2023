package homework_7.Diana_Melkonyan;

public class Printer {
    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        printOrderItem(order);
        printDelimiter();
        printPizza(order.getPizzas());
        printDrink(order.getDrinks());
        printDelimiter();
        printOrderPrice(order);

    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void printOrderItem(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client:" + order.getCustomer().getNumber());
    }
    private static void printPizza(Pizza[] pizzas){
        for (Pizza pizza:pizzas) {
            if(pizza !=null){
                System.out.println("Name: " + pizza.getName());

             //   System.out.println( pizza.getPizzaType().getName() + " " +  pizza.getPizzaType().getPrice()  + "$");
                printIngredients(pizza.getIngredients());
                printDelimiter();
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("Amount :" + pizza.calculatePrice() + "$");
                printDelimiter();
            }

        }
    }
    private static void printDrink(Drink[] drinks){
        for(Drink drink: drinks){
            if(drink !=null){
                System.out.println("Name: " + drink.getName());
                System.out.println("Quantity: " + drink.getQuantity());
                System.out.println("Amount :" + drink.calculatePrice() + "$");
            }
        }
    }
private static void printIngredients(Ingredient[] ingredients) {
    for (Ingredient ingredient : ingredients) {
        if (ingredient != null) {
            System.out.println(ingredient.getName() + "_" + ingredient.getPrice() + "$");
        }
    }
}

    private static void printOrderPrice(Order order) {
        System.out.println("Total amount: " + order.calculateOrderPrice() + "$");
    }
    private static void printDelimiter(){
        System.out.println("******************");
    }

//    private static void trainlingLine() {
//        System.out.println("********************");
//    }

}