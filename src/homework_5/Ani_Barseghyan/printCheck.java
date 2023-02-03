package homework_5.Ani_Barseghyan;

public class printCheck {
    private Pizza[] pizzas;
    private Order order;
    private Customer customer;
    private double pizzaPrice = 0;


    printCheck(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
        this.pizzas = order.getPizzas();
    }


    public void displayOrder(Pizza pizza) {
        System.out.println("[" + order.getOrderNumber() + " : " + customer.getCustomerNumber() + " : " + pizza.getPizzaName() + " : " + pizza.getQuantity() + "]");
    }


    public void printCheck() {
        System.out.println("*********************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Order: " + customer.getCustomerNumber());
        for (int i = 0; i < order.getPizzaCount(); i++) {
            System.out.println("Pizza: " + pizzas[i].getPizzaName());
            System.out.println("---------------------");
            System.out.println("Pizza Base " + pizzas[i].getPizzaType() + " " + pizzas[i].getCrustCost());
            for (Ingredients ing : pizzas[i].getIngredients()) {
                if (ing == null) {
                    break;
                } else {
                    System.out.println(ing.getToppingName() + " " + ing.getToppingCost());
                }
            }
            System.out.println("---------------------");
            System.out.println("Amount " + pizzas[i].calculatePizzaCost());
            System.out.println("Quantity " + pizzas[i].getQuantity());
            System.out.println();
            pizzaPrice +=  pizzas[i].calculatePizzaCost() * pizzas[i].getQuantity();
        }
        System.out.println("*********************");
        System.out.println("Total amount: " + pizzaPrice);
    }
}
