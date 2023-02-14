package homework_5.Liana_gevorgyan.Pizzeria;

public class Order {
    int orderId = 10_000;
    int customerId;
    int pizzaIndex=0;
    Pizza [] pizzaList = new Pizza[10];


    public Order(int orderId, int customerId) {
        if (orderId >= 10000 && orderId < 99999) {
            this.orderId = orderId;
        } else {
            System.out.println("OrderId should be 5 digit number");
        }
        this.customerId = customerId;
    }

    //This method creates a new Pizza based on provided name, type, quantity and ingedients list and added to the order
    public void addPizza(String name, String type, int quantity, String[] ingredients) {
        if (pizzaIndex <= 10) {

            // name should not be shorter than 4 and longer than 20
            // in such cases new name should be formulated by customer id and pizza index in the order
            if (name.length() < 4 || name.length() > 20) {
                name = customerId + "_" + pizzaIndex;
            }

            Pizza pizza = new Pizza(name, type, quantity);
            for (int i = 0; i < ingredients.length; i++) {
                pizza.addIngredient(ingredients[i]);
            }

            pizzaList[pizzaIndex] = pizza;
            pizzaIndex++;
        } else {
            System.out.println("Order is full, you can not order more then 10 pizzas");
        }

    }
    public void print(){
        System.out.println("Order: " + orderId);
        System.out.println("Client: " + customerId);
        System.out.println("___________________");

        double totalAmount = 0;
        for (int i = 0; i< pizzaIndex; i++){
            pizzaList[i].print();
            totalAmount = totalAmount + pizzaList[i].price*pizzaList[i].quantity;
            System.out.println("***********************");
        }

        System.out.println("___________________");
        System.out.println("Total Amount: " + totalAmount + "$");
    }
}
