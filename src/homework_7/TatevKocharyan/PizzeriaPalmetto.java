package homework_7.TatevKocharyan;

import homework_7.TatevKocharyan.exceptions.InvalidNameException;

public class PizzeriaPalmetto {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        try {
            customer.setCustomerName("Tatev");
        }catch (InvalidNameException e){
            e.getMessage();
        }
        customer.setPhoneNumber("+37498000000");
        Order order = new Order();
        Ingredient[] ingredients = {Ingredient.CHEEES, Ingredient.BACON, Ingredient.SALAMI};
        order.addProduct("MyPizza", PizzaType.CALZONE, ingredients, 15);
        order.addProduct("HerPizza", PizzaType.CALZONE, ingredients, 3);
        order.setCusomer(customer);
        Printer.printCheck(order);
       try {
           customer2.setCustomerName("David");
       }catch (InvalidNameException e){
           e.getMessage();
       }
        customer2.setPhoneNumber("+37495555555");
        Order order1 = new Order();
        Ingredient[] ingredients1 = {Ingredient.SALAMI, Ingredient.CHEEES, Ingredient.CORN};
        order1.addProduct("HisPizza", PizzaType.REGULAR, ingredients1, 5);
        order1.setCusomer(customer2);
        Printer.printCheck(order1);
        order.addProduct("MyDrink",DrinkType.ORANGEJUICE,3);

    }
}
