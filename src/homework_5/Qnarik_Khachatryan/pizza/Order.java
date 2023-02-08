package homework_5.Qnarik_Khachatryan.pizza;


import java.util.Arrays;
import java.time.LocalTime;

public class Order {
    Pizza[] pizzas; //исходный массив из 10 элементов
    Pizza[] newPizzas; // массив с количеством элементов за вычетом уже созданных пицц
    private final int orderNumber;
    private static int orderNumberNext = 10000;
    int pizzaCount = 0; //
    int pizzaIndex = 0;  //using at pizza's name when it does not satisfy our conditions
    double totalAmount = 0;
    Customer customer;
    private int maxPizzasInOrder = 10;
    private final LocalTime orderTime;


    Order(Customer customer) {
        this.customer = customer;
        this.pizzas = new Pizza[maxPizzasInOrder]; //list of pizzas
        this.orderNumber = orderNumberNext++;
        this.orderTime = getLocalTimeWithoutNanos();

    }

    LocalTime getLocalTimeWithoutNanos() {
        LocalTime localTime = LocalTime.now();
        long nanos = localTime.getNano();
        return localTime.minusNanos(nanos);
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    void addPizza(Pizza pizza, int quantity) { // adding pizza to pizzas

        if (!pizza.getName().matches("^[a-zA-Z.]+$")
                || pizza.getName().length() > 20
                || pizza.getName().length() < 4) {
            pizza.setName(customer.getName() + "_" + pizzaIndex);
        }
        pizzas[pizzaIndex] = pizza; // adding first pizza
        Pizza[] newPizzas = reduceArraySize(pizzas, quantity - 1); // create new array with reduced size and copy
        // there pizza from pizzas
        newPizzas[pizzaIndex] = pizza; // adding next pizza
        pizzaIndex++;
        pizzaCount += quantity; // quantity of all added pizzas
        pizza.pizzasQuantity = quantity; // quantity of just adding pizza

    }

    /* создает новый массив с размером (максимальноДопустимоеКоличествоПиццВОдномЗаказе(10) - количествоУжеСозданныхПицц)
    и копирует туда пиццы со старого массива*/
    /* create new array with size (maxPizzasInOrder - quantity of already created pizzas) and copy there pizzas from
     old array*/
    public Pizza[] reduceArraySize(Pizza[] arr, int quantity) {
        newPizzas = Arrays.copyOf(arr, maxPizzasInOrder -= quantity);
        return newPizzas;
    }


    public void printCheck() {
        System.out.println();
        System.out.println("********************************");
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getNumber());
        for (int i = 0; i < pizzaIndex; i++) {  // количество позиций в заказе
            Pizza pizza = pizzas[i];
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");
            PizzaType type = pizza.type;
            System.out.println("Pizza Base (" + type + ") " + pizza.getTypePrice(type) + " €");
            for (int j = 0; j < pizza.ingredientsCountInPizza; j++) {  //количество ингредиентов в каждой пицце
                IngredientType ingredient = pizza.listOfIngredients[j];
                System.out.println(ingredient + " " + pizza.getIngredientPrice(ingredient) + " €");
            }
            System.out.println("--------------------------------");
            double amount = pizza.calculatePrice();
            System.out.println("Amount: " + amount + " €");

            System.out.println("Quantity: " + pizza.pizzasQuantity);
            System.out.println("--------------------------------");
            totalAmount += amount * pizza.pizzasQuantity;
        }
        System.out.println("Total amount: " + totalAmount + " €");
        System.out.println("********************************");


    }

    public void displayPizzaAttributes(Pizza pizza) {
        System.out.println(this.orderNumber + ":" + this.customer.getNumber() + ":" + pizza.getName() + ":" +
                pizza.pizzasQuantity);
    }

}


