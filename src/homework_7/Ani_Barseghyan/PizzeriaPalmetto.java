package homework_7.Ani_Barseghyan;

import homework_7.Ani_Barseghyan.exceptions.DuplicateIngredientException;
import homework_7.Ani_Barseghyan.exceptions.NameException;
import homework_7.Ani_Barseghyan.exceptions.PhoneNumberException;
import homework_7.Ani_Barseghyan.exceptions.ProductQuantityException;

public class PizzeriaPalmetto {
    public static void main(String[] args) throws DuplicateIngredientException, ProductQuantityException {
        Customer customer = new Customer();
        try {
            customer.setCustomerName("Ani");
        } catch (NameException n) {
            System.out.println(n);
        }
        try {
            customer.setPhoneNumber("+54");
        } catch (PhoneNumberException p) {
            System.out.println(p);
        }


        Order order = new Order();
        order.setCustomer(customer);


        Product pizza1 = new Pizza("MyPizza3", PizzaType.REGULAR, 15);
        Product beverage1 = new Beverage("Beer", BeverageType.ALCOHOLIC, 2);

        Ingredients tomato = Ingredients.TOMATO;
        Ingredients cheese = Ingredients.CHEESE;

        try {
            ((Pizza) pizza1).addIngredient(tomato);
            ((Pizza) pizza1).addIngredient(cheese);
            ((Pizza) pizza1).addIngredient(tomato);
        } catch (DuplicateIngredientException d) {
            System.out.println(d.getMessage());
        }

        try {
            order.addProduct(pizza1);
            order.addProduct(beverage1);
        } catch (ProductQuantityException q) {
            System.out.println(q.getMessage());
        }

        Printer.printCheck(order);
    }
}
