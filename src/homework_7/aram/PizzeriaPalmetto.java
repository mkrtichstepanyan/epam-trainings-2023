package homework_7.aram;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        try{
            customer.setName("123");
        } catch (NameException n){
            System.out.println(n);
        }
        try {
            customer.setPhoneNumber("ghghg");
        }catch (PhoneNumberException p){
            System.out.println(p);
        }

        Ingredient[] ingredients1 = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients2 = {Ingredient.TOMATO_PASTE};
        Pizza pizza1 = new Pizza("MyPizza1", PizzaType.CALZONE, ingredients1, 1);
        pizza1.addIngredient(Ingredient.PEPPERONI);
        pizza1.addIngredient(Ingredient.OLIVES);
        Pizza pizza2 = new Pizza("MyPizza2", PizzaType.CALZONE, ingredients2, 2);

        Order order = new Order();
        try{
            order.setOrderNumber(10001);
        } catch (OrderNumberException o){
            System.out.println(o);
        }

        order.setCustomer(customer);
        order.addPizza(pizza1.getName(), pizza1.getPizzaType(), pizza1.getIngredients(), pizza1.getQuantity());
        order.addPizza(pizza2.getName(), pizza2.getPizzaType(), pizza2.getIngredients(), pizza2.getQuantity());
        Printer.printCheck(order);
    }
}