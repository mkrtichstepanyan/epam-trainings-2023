package homework_5.Alina_Mkhoyan.pizzeria;

public class Test {
    public static void main(String[] args) {
        Pizza peperoni = Pizza.addPizza("Peperoni", PizzaType.CLOSED, Ingredient.BACON, Ingredient.CHEESE,
                Ingredient.GARLIC, Ingredient.PEPPERONI);
        Pizza margarita = Pizza.addPizza("Margarita", PizzaType.REGULAR, Ingredient.BACON,
                Ingredient.BACON, Ingredient.PEPPERONI);
        Pizza roman = Pizza.addPizza("Roman", PizzaType.REGULAR,Ingredient.TOMATO,
                Ingredient.OLIVES, Ingredient.BACON,Ingredient.GARLIC);

        Customer customer = Customer.addCustomer("mard");
        OrderItem orderItem = OrderItem.addOrderItem(peperoni, 5);
        OrderItem orderItem1 = OrderItem.addOrderItem(margarita, 5);
        OrderItem orderItem2 = OrderItem.addOrderItem(roman,7);
        CheckPrinter.checkPrint(Order.addOrder(customer, orderItem, orderItem1,orderItem2));
    }
}
