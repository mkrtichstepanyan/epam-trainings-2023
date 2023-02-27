package homework_7.TatevKocharyan;

public class PizzeriaPalmetto {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        customer.setCustomerName("Tatev");
        customer.setPhoneNumber("+37498000000");
        Order order = new Order();
        Ingredient []ingredients={Ingredient.CHEEES,Ingredient.BACON,Ingredient.SALAMI};
        order.addPizza("MyPizza", PizzaType.CALZONE,ingredients,10);
        order.addPizza("HerPizza", PizzaType.CALZONE,ingredients,3);
        order.setCusomer(customer);
        Printer.printCheck(order);
        customer2.setCustomerName("David");
        customer2.setPhoneNumber("+37495555555");
        Order order1=new Order();
        Ingredient[]ingredients1={Ingredient.SALAMI,Ingredient.CHEEES,Ingredient.CORN};
        order1.addPizza("HisPizza",PizzaType.REGULAR,ingredients1,5);
        order1.setCusomer(customer2);
        Printer.printCheck(order1);

    }
}
