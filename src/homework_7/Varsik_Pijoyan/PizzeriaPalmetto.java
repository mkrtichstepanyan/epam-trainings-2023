package homework_7.Varsik_Pijoyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        try {
            customer.setName("21473");
            System.out.println(customer.getName());
        } catch (NameException n) {
            System.out.println(n);
        }

        try {
            customer.setPhoneNumber("0000");
            System.out.println(customer.getPhoneNumber());
        } catch (PhoneNumberException p) {
            System.out.println(p);
        }

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = { Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE };

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);

        order.calculateOrderPrice();
        Printer.printCheck(order);
    }
}
