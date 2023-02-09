package homework_5.Vardan_Mkrtchyan.Pizza;
public class OrderPizza {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Order order1 = new Order(customer1);
        Pizza pz1 = new Pizza("Margarita", true, 2);
        Pizza pz2 = new Pizza("Lopopito", false, 1);
        pz1.addIngredient();
        pz2.addIngredient();
        order1.addPizza(pz1);
        order1.addPizza(pz2);
        order1.printCheck();
        System.out.println();
        System.out.println();
        System.out.println("ANOTHER CLIENT");
        System.out.println();
        Customer customer2 = new Customer();
        Order order2 = new Order(customer2);
        order2.addPizza(pz1);
        order2.printCheck();
    }
}
