package homework_9.Lilit_Adamyan.pizza;

import java.time.LocalDate;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer("John");
        customer.setPhoneNumber("+37498000000");
        Pizza margarita = new Pizza("Margarita", PizzaType.CALZONE, Ingredients.TOMATO_PASTE, 2, customer);
        margarita.addIngredient(Ingredients.TOMATO_PASTE.getPrice());
        margarita.addIngredient(Ingredients.PEPPERONI.getPrice());
        margarita.addIngredient(Ingredients.GARLIC.getPrice());
        margarita.addIngredient(Ingredients.BACON.getPrice());

        Order order = new Order();
        order.setCustomer(customer);
        Ingredients[] ingredients = {Ingredients.CHEESE, Ingredients.SALAMI};
        order.addPizza("MyPizza", PizzaType.CALZONE, Ingredients.BACON, 1);
        order.printOrderAttributes();
        Printer.printCheck(order);

       CustomerDTO customerDTO= new CustomerDTO();
       customerDTO.setName("Tom");
       customerDTO.setEmail("test@example.com");
       customerDTO.setBirthday(LocalDate.of(2000,1,4));
       customerDTO.setDiscountRate(90);

       String[]errors = Validator.validate(customerDTO);
       if(errors.length>0) {
           System.out.println("Validation errors: ");
           for (String error : errors) {
               System.out.println("_" + error);
           }
       }else System.out.println("Validation successful");{



       }

    }
}
