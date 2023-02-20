package homework_7.sevak.Ani_Barseghyan;

public class PizzeriaPalmetto {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Ani");
        customer.setPhoneNumber("+3747777777");

        Order order = new Order();


        Pizza pizza1 = new Pizza("MyPizza3", PizzaType.REGULAR, 2);
        pizza1.addIngredients(Ingredients.CORN);
        pizza1.addIngredients(Ingredients.TOMATO);
        pizza1.addIngredients(Ingredients.TOMATO);
        order.addPizza(pizza1);

        Ingredients[] ingredients = {Ingredients.TOMATO, Ingredients.CHEESE, Ingredients.SALAMI};
        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);

        order.addBeverage(BeveragesMenu.BEER, 2);
        order.addBeverage(BeveragesMenu.SODA, 1);
        order.setCustomer(customer);
        Printer.printCheck(order);
    }
}
