package homework_10.Zara_Avetyan.pizza;

public class PizzeriaPalmetto {
    public static void main(String[] args) {
        Customer customer = new Customer();
        try {
            customer.setName("Sev5ak");
        } catch (NameException e) {
            System.out.println(e);
        }
        try {
            customer.setPhoneNumber("374");
        } catch (PhoneNumberException e) {
            System.out.println(e);
        }

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        try {
            order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 5);
        } catch (Quantity q) {
            System.out.println(q);
        }


        Printer.printCheck(order);
    }

}
