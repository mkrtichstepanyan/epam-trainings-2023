package homework_7.Ani_Barseghyan;

public class PizzeriaPalmetto {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Ani");
        customer.setPhoneNumber("+3747777777");

        Order order = new Order();
        order.setCustomer(customer);


        Pizza pizza1 = new Pizza("MyPizza3", PizzaType.REGULAR, 2);
        Product beverage1 = new Beverage("Beer", BeverageType.ALCOHOLIC, 2);
        pizza1.addIngredients(PizzaIngredients.CORN);
        pizza1.addIngredients(PizzaIngredients.TOMATO);
        pizza1.addIngredients(PizzaIngredients.TOMATO);
        order.addProduct(pizza1);
        order.addProduct(beverage1);
        Printer.printCheck(order);
    }
}
