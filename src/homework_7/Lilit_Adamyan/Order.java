package homework_7.Lilit_Adamyan;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index;
    private int orderNumber;
    private Customer customer;
    private List<Product> products = new ArrayList<>();//stex me listm bdi pahes erkusi hamar.liste che masiv,bdi chexni
    //product list u fsyo, u ira mej qces ham pizza ham xmmichq, vordev erkusnel product tipien, hasanq es toxin haskcanq or copy enel@ sxale.ba)
    //es moment@ chisht kazmakerpe qezi petq che erku hat massiv, me hatm uneci Product tipi vori mej hangist kkrnanas save enes ham drink ham pizza
    private final Pizza[] pizzas = new Pizza[10];

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type, Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity, customer);
        //gjva toxm verev pizzai anuna MyPizza nerqev@ arden joshe
        addProduct(pizzas[pizzaIndex]);
    }

    public double calculateOrderPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        return total;
    }

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getName().equals(product.getName())) {
                p.addQuantity(product.getQuantity());
                return;
            }
        }
        products.add(product);
    }


    public void printOrderAttributes() {
        for (Product pizza : pizzas) {
            if (pizza != null) {
                System.out.println("[" + orderNumber + ":" + customer.getNumber() + ":" + pizza.getName() + ":" + pizza.getQuantity() + "]");
            }
        }
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (pizzaName!=null){
            if (isValidPizzaName(pizzaName)) {
                validPizzaName = customer.getName() + "_" + pizzaIndex;  //spasi
            }
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return  pizzaName.length() < 4 || pizzaName.length() > 20;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static int getInitialId() {
        return initialId;
    }

    public int getIndex() {
        return index;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }
}
