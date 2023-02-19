package homework_7.Anna_Manukyan;

public class OrderForPizza extends Order{
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    OrderForPizza() {
        orderNumber = initialId++;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateOrderPrice() {
        double orderPrice = 0;
        for (Pizza pizza : (Pizza[]) foods) {
            orderPrice += pizza.calculatePrice() * pizza.getQuantity();
        }
        return orderPrice;
    }


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

    public int getOrderNumber(){
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Food[] getFoods() {
        return foods;
    }

    @Override
    public void addFood(Food food) {
        if (food.foodType == FoodType.PIZZA) {
            Pizza pizza  = (Pizza) food;
            if (pizza.getQuantity() > MAX_PIZZA_AMOUNT) {
                System.out.println("hop axper jan!!");
                return;
            }
            int pizzaIndex = index++;
            String validPizzaName = getValidPizzaName(pizza.getName(), pizzaIndex);
            foods[pizzaIndex] = new Pizza(validPizzaName, pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity(), food.foodType);
        }
    }

    @Override
    public void printOrderAttributes() {
        for (Pizza pizza : (Pizza[]) foods) {
            System.out.println("[" + orderNumber + customer.getNumber() + pizza.getName() + pizza.getQuantity() + "]");
        }
    }
}
