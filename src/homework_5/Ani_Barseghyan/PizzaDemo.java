package homework_5.Ani_Barseghyan;

public class PizzaDemo {
    public static void main(String[] args) {

        // New customer1 with 2 pizza orders
        Customer customer1 = new Customer();
        Order order1 = new Order(customer1, 2);


        Pizza pizza1 = new Pizza("Margherita", 'b');
        pizza1.setQuantity(1);
        pizza1.setPizzaName(pizza1.getPizzaName(), order1.getOrderNumber());
        pizza1.addIngredient(Ingredients.addTomatoPaste());
        pizza1.addIngredient(Ingredients.addCheese());
        pizza1.addIngredient(Ingredients.addGarlic());

        Pizza pizza2 = new Pizza("PepperoniOro", 'c');
        pizza2.setQuantity(2);
        pizza2.setPizzaName(pizza2.getPizzaName(), order1.getOrderNumber());
        pizza2.addIngredient(Ingredients.addTomatoPaste());
        pizza2.addIngredient(Ingredients.addCheese());
        pizza2.addIngredient(Ingredients.addGarlic());

        order1.setPizzas(pizza1, pizza2);


        PrintCheck check1 = new PrintCheck(order1, customer1);
        check1.displayOrder(pizza1);
        check1.displayOrder(pizza2);


        check1.printCheck();

        // New customer2 with 1 pizza order

        Customer customer2 = new Customer();
        Order order2 = new Order(customer2, 1);


        Pizza pizza3 = new Pizza();
        pizza3.setQuantity(5);
        pizza3.setPizzaName(pizza3.getPizzaName(), order2.getOrderNumber());
        pizza3.setPizzaType(pizza3.getPizzaType());
        order2.setPizzas(pizza3);

        PrintCheck check2 = new PrintCheck(order2, customer2);
        check2.displayOrder(pizza3);
        check2.printCheck();


        // New customer3 with 1 pizza orders
        Customer customer3 = new Customer();
        Order order3 = new Order(customer3, 12);


        Pizza pizza4 = new Pizza("Marinara");
        pizza4.setQuantity(11);
        pizza4.setPizzaName(pizza4.getPizzaName(), order3.getOrderNumber());
        pizza4.setPizzaType(pizza4.getPizzaType());
        pizza4.addIngredient(Ingredients.addTomatoPaste());
        pizza4.addIngredient(Ingredients.addGarlic());
        order3.setPizzas(pizza4);

        PrintCheck check3 = new PrintCheck(order3, customer3);
        check3.displayOrder(pizza4);
        check3.printCheck();

    }
}
