package homework_5.Ofelya_Khachatryan.pizza;


public class Main {
    public static void main(String[] args) {
        PlaceOrderService placeOrderService = new PlaceOrderService();
        Pizza firstCustomerFirstPizza = new Pizza("Margarita", null, new PizzaType("regular"), 2);
        placeOrderService.addIngredients(new Ingredient[0], firstCustomerFirstPizza);
        Pizza firstCustomerSecondPizza = new Pizza("PepperoniOro",null,new PizzaType("closed"),3);
        placeOrderService.addIngredients(new Ingredient[0], firstCustomerSecondPizza);
        placeOrderService.createOrder(7717,new Pizza[]{firstCustomerFirstPizza,firstCustomerSecondPizza});

        placeOrderService.printPizzaAttributes();

        Pizza secondCustomer = new Pizza("BasePZZ", null, new PizzaType("closed"),12);
        placeOrderService.addIngredients(new Ingredient[0],secondCustomer);
        placeOrderService.createOrder(4372, new Pizza []{secondCustomer});
    }
}