package homework_6.Hayk_Davtyan.Pizza;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaService service = new PizzaService();
        Pizza pizza = service.createPizza();
        System.out.println("[" + pizza.getOrder() + ":" + pizza.getCustomer() + ":" + pizza.getName() + ":" + pizza.getQuantity() + "]");
    }
}
