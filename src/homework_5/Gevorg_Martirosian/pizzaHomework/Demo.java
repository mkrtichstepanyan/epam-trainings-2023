package homework_5.Gevorg_Martirosian.pizzaHomework;

public class Demo {
    public static void main(String[] args) {
        Customer firstPerson = new Customer("First", "Person");
        Customer secondPerson = new Customer("Second", "Person");
        Pizza firstPizza = new Pizza("Margarita", "calzone", 2);
        Pizza secondPizza = new Pizza("PepperoniOro", "base", 3);
        Pizza thirdPizza = new Pizza("BasePZZ", "base", 12);
        thirdPizza.addIngredients("tomato paste", "cheese", "olives");
        Order firstOrder = new Order(firstPerson, firstPizza, secondPizza);
        Order secondOrder = new Order(secondPerson, thirdPizza);
        firstOrder.printCheck();
        secondOrder.printCheck();
    }
}
