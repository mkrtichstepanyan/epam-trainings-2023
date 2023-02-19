package homework_7.sevak.Ani_Barseghyan;

public class PizzeriaPalmetto {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Ani");
        customer.setPhoneNumber("+3747777777");

        Order order = new Order();
        Ingredients addCorn = Pizza.addIngredients(Ingredients.CORN);
        Ingredients addTomato = Pizza.addIngredients(Ingredients.TOMATO);
        Ingredients[] ingredients = {Ingredients.TOMATO, Ingredients.CHEESE, Ingredients.SALAMI, addCorn, addTomato};
        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);
        order.setCustomer(customer);
        Printer.printCheck(order);
        order.getPizzas();


    }
}
