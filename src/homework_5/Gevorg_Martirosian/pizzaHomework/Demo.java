package homework_5.Gevorg_Martirosian.pizzaHomework;

public class Demo {
    public static void main(String[] args) {
        Customer firstPerson = new Customer("First", "Person");
        Customer secondPerson = new Customer("Second", "Person");
        Pizza firstPizza = new Pizza("Mar", "calzone", 9, firstPerson);
        Pizza secondPizza = new Pizza("PepperoniOro", "base", 2, secondPerson);
        Pizza thirdPizza = new Pizza("BasePZZ", "base", 1, secondPerson);
        thirdPizza.addIngredients("Tomato paste");
        thirdPizza.addIngredients("Tomato paste");
        thirdPizza.addIngredients("Cheese");
        thirdPizza.addIngredients("Salami");
        thirdPizza.addIngredients("Bacon");
        thirdPizza.addIngredients("Garlic");
        thirdPizza.addIngredients("Corn");
        thirdPizza.addIngredients("Pepperoni");
        thirdPizza.addIngredients("Olives");
        Order firstOrder = new Order(firstPerson, firstPizza, secondPizza);
        Order secondOrder = new Order(secondPerson, thirdPizza);
        firstOrder.printCheck();
        firstOrder.showPizzas();
        secondOrder.printCheck();
        secondOrder.showPizzas();
    }
  }
