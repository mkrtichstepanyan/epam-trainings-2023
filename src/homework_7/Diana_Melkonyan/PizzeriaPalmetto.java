package homework_7.Diana_Melkonyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        try {
            customer.setName("123");
        }catch (NameException n){
            System.out.println(n);
        }

        try {
            customer.setPhoneNumber("0000");
        }catch (PhoneNumberException p){
            System.out.println(p);
        }


        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI,
        Ingredient.OLIVES, Ingredient.CORN, Ingredient.BACON};

   //     order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
   //     order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);
        order.addPizza(Pizza.MARGARITA.getName(), Pizza.MARGARITA.getPizzaType(), Pizza.MARGARITA.getIngredients(),
                Pizza.MARGARITA.getQuantity());

       order.addPizza(Pizza.PEPPERONI.getName(), Pizza.PEPPERONI.getPizzaType(), Pizza.PEPPERONI.getIngredients(),
               Pizza.PEPPERONI.getQuantity());
        order.addDrink("Cola",DrinkType.Coca_Cola,2);
        Printer.printCheck(order);

    }
}
