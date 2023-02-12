package homework_5.Andranik_Sargsyan.pizzeria.pizzeria;

public class TestPizza {
    public static void main(String[] args) {

        Pizza Calzone = Pizza.addPizza("Calzone", PizzaType.getCalzoneType(), Ingredient.getGarlic(),
                Ingredient.getBacon(), Ingredient.getOlives(), Ingredient.getCheese());

        Pizza Margarita = Pizza.addPizza("Margarita", PizzaType.getRegularType(), Ingredient.getCheese(),
                Ingredient.getBacon(), Ingredient.getSalami(), Ingredient.getTomatoPaste());
        for (Ingredient ingredient : Margarita.getIngredients()) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
        }

        Pizza Jazz = Pizza.addPizza("myPizza", PizzaType.getCalzoneType(), Ingredient.getPepperoni(),
                Ingredient.getCheese(), Ingredient.getSalami());

        Customer client = new Customer("And", "+374123 ");
        OrderItem order = new OrderItem(Calzone, 8);
        OrderItem order1 = new OrderItem(Margarita, 3);
        OrderItem order2 = new OrderItem(Jazz, 4);
        CheckPrinter.checkPrint(Order.addOrder(client, order2, order1, order));

    }
}
