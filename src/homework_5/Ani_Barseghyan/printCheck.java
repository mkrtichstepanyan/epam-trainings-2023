package homework_5.Ani_Barseghyan;

public class printCheck {
    private Pizza pizza;
    private Order order;
    private int orderNumber;


    printCheck(Order order, Pizza pizza) {
        this.pizza = pizza;
        this.order = order;
    }


    public void displayOrder() {
        System.out.println("[" + order.getOrderNumber() + " : " + order.getCustomerNumber() + " : " + pizza.getPizzaName() + " : " + pizza.getQuantity() + "]");
    }


    public void printCheck() {
        System.out.println("*********************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Order: " + order.getCustomerNumber());
        System.out.println("Pizza: " + pizza.getPizzaName());
        System.out.println("---------------------");
        System.out.println("Pizza Base " + pizza.getPizzaType() + " " + pizza.getCrustCost());
        for (Ingredients i : pizza.getIngredients()) {
            if (i == null) {
                break;
            }else {
                System.out.println(i.getToppingName() + " " + i.getToppingCost());
            }
        }
        System.out.println("---------------------");
        System.out.println("Amount " + pizza.calculatePizzaCost() * pizza.getQuantity());
        System.out.println("Quantity " + pizza.getQuantity());
//        System.out.println("*********************");
    }
}
