package homework_7.Ani_Barseghyan;

public class PizzeriaPalmetto {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Ani");
        customer.setPhoneNumber("+3747777777");

        Order order = new Order();
        order.setCustomer(customer);


        Product pizza1 = new Pizza("MyPizza3", PizzaType.REGULAR, 2);
        Product beverage1 = new Beverage("Beer", BeverageType.ALCOHOLIC, 2);

        Ingredients tomato = PizzaIngredients.TOMATO;
        Ingredients cheese = PizzaIngredients.CHEESE;

        ((Pizza) pizza1).addIngredient(tomato);
        ((Pizza) pizza1).addIngredient(cheese);
        ((Pizza) pizza1).addIngredient(tomato);

        order.addProduct(pizza1);
        order.addProduct(beverage1);

        Printer.printCheck(order);
    }
}
