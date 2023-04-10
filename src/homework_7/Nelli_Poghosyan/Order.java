package homework_7.Nelli_Poghosyan;

public class Order {
    private static final int MAX_PRODUCT_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index = 0;
    private int orderNumber;
    private Customer customer;
    private Product[] products = new Product[10];


    Order() {
        orderNumber = initialId++;
    }


    public void addProduct(Product product) {
        int productIndex = index++;
        if (product instanceof Pizza) {
            if (product.getQuantity() > MAX_PRODUCT_AMOUNT) {
                System.out.println("hop axper jan!!");
                return;
            }

            String validPizzaName = getValidPizzaName(product.getName(), productIndex);
            products[productIndex] = new Pizza(validPizzaName, (PizzaType) product.getProductType(),product.getIngredients(), product.getQuantity());
        }
        if (product instanceof Drink) {
             productIndex = index++;
            products[productIndex] = new Drink(((Drink) product).getDrinkType(), product.getQuantity());
        }
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateTotalOrderPrice() {
        double price = 0.0;
        for (Product product : products) {
            if (product != null) {
                price = price + (product.calculatePrice() * product.getQuantity());
            }
        }
        return price;
    }

    public void printTotalPrice() {
        System.out.println(calculateTotalOrderPrice());
    }

    public void printOrderAttributes() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("[" + orderNumber + customer.getNumber() + " " + product.getName() + " " + product.getQuantity() + "]");
            }
        }
    }

    public void printOrderNumberAndClientNumber() {
        System.out.println("Order: " + orderNumber + "\nClient: " + customer.getNumber());
    }

    public void printPizzaAttributes() {
        for (Product product : products) {
            if (product != null) {
                if(product instanceof Pizza){
                System.out.println("Name " + product.getName());
                Printer.printDelimiter();
                System.out.println("Pizza base(" + product.getProductType().getName() + ") " + product.getProductType().getPrice() + "$");
                if (((Pizza)product).getIngredient() == null) {
                    return;
                } else {
                    for (Ingredient ingredient : product.getIngredients()) {
                        System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "$");
                    }
                }
                Printer.printDelimiter();
                System.out.println("Amount " + product.calculatePrice() + "$");
                System.out.println("Quantity  " + product.getQuantity());
                Printer.printDelimiter();
            }
                if(product instanceof Drink){
                    System.out.println("Drink "+((Drink) product).getDrinkType().getName()+"\nBrand " + ((Drink) product).getDrinkType().getBrand() + "\nQuantity " + product.getQuantity() + "\nAmount " + ((Drink) product).getDrinkType().getPrice() + "$");
                    Printer.printDelimiter();
                }
        }
    }}


    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }
}
