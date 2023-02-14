package homework_5.Liana_gevorgyan.Pizzeria;

public class PlaceOrder {
    public static void main(String[] args) {
        Order  order1=  new Order(10001, 7717);
        String[] ingredients1 = {"Bacon", "Salami", "Olives", "Tomato paste"};

        //Provided to long name for checking that it would be replaced with a generated name
        order1.addPizza("MargaritaMargaritaMargarita","Regular",2, ingredients1);
        String[] ingredients2 = {"Corn", "Garlic", "Corn"};
        //provides extra quantity for checking, if quantity is more than 10,
        // then it will return Customer id and order index
        order1.addPizza("Vegetarian", "Calzone", 20, ingredients2);

        System.out.println();

        order1.print();

    }


}
