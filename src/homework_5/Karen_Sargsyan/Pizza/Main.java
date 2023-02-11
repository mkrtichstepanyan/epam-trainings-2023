package homework_5.Karen_Sargsyan.Pizza;

public class Main {

    public static void main(String[] args) {
        Ingredient tomatoPaste = Ingredient.getTomatoPaste();
        Ingredient cheese = Ingredient.getCheese();
        Ingredient salami = Ingredient.getSalami();
        Ingredient bacon = Ingredient.getBacon();
        Ingredient garlic = Ingredient.getGarlic();
        Ingredient corn = Ingredient.getCorn();
        Ingredient pepperoni = Ingredient.getPepperoni();
        Ingredient olives = Ingredient.getOlives();


//        System.out.println(tomatoPaste.getNameOfIngredient() + tomatoPaste.getPrice());

        Order order = new Order();

        Customer customer = new Customer();

        Pizza pizza = new Pizza();

        pizza.checkPizzaName(7717, "Vazgen", 45);



        pizza.displayingPizzaAttributes(order.getOrderNumber(), 7717, "Margarita", 2);






    }
}
