package homework_5.Liana_gevorgyan.Pizzeria;

public class PlaceOrder {
    public static void main(String[] args) {
        Order  order1=  new Order(10001, 7717);
        Pizza pizza1 = new Pizza("Margarita","Regular",2);
        pizza1.addIngredient("Bacon");
        pizza1.addIngredient("Salami");
        pizza1.addIngredient("Olives");
        pizza1.addIngredient("Tomato paste");
        order1.addPizza(pizza1);

        Pizza pizza2 = new Pizza("Vegetarian", "Calzone", 1);
        pizza2.addIngredient("Corn");
        pizza2.addIngredient("Garlic");
        pizza2.addIngredient("Corn");
        order1.addPizza(pizza2);

        System.out.println();

        order1.print();

    }


}
