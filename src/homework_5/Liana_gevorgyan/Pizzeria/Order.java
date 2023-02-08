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

    public void addPizza(Pizza pizza){
        if(pizzaIndex<= 10){
            pizzaList[pizzaIndex]= pizza;
            pizzaIndex ++;
        }else{
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
