package homework_5.Qnarik_Khachatryan.pizza;


public class Order {
    Pizza[] pizzas;
    private final int orderNumber;
    private static int orderNumberNext = 10000;
    int pizzaCount = 0; //
    int pizzaIndex = 0;  //using at pizza's name when it does not satisfy our conditions
    double totalAmount = 0;
    Customer customer;


    Order(Customer customer) {
        this.customer = customer;
        this.pizzas = new Pizza[10]; //list of pizzas
        this.orderNumber = orderNumberNext++;

    }

    void addPizza(Pizza pizza, int quantity) { // adding pizza to pizzas

        if (!pizza.getName().matches("^[a-zA-Z.]+$")
                || pizza.getName().length() > 20
                || pizza.getName().length() < 4) {
            pizza.setName(customer.getName() + "_" + pizzaIndex);
        }
        pizzas[pizzaIndex] = pizza;
        pizzaIndex++;
        pizzaCount += quantity;
        pizza.pizzasQuantity = quantity;
    }


    public void printCheck() {
        System.out.println("********************************");
        System.out.println("Order: " + orderNumber);
        System.out.println("Client: " + customer.getNumber());

        for (int i = 0; i < pizzaIndex; i++){  // количество пицц в заказе
            Pizza pizza = pizzas[i];
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");
            System.out.println("Pizza Base (" + pizza.type + ")");
            for (int j = 0; j < pizza.ingredientsCountInPizza; j++){  //количество ингредиентов в каждой пицце
                IngredientType ingredient = pizza.listOfIngredients[j];
                System.out.println(ingredient + " " + pizza.getIngredientPrice(ingredient) + " €");
            }
            System.out.println("--------------------------------");
            double amount = pizza.calculatePrice();
            System.out.println("Amount: " + amount + " €");

            System.out.println("Quantity: " + pizza.pizzasQuantity);
            System.out.println("--------------------------------");
            totalAmount+=amount* pizza.pizzasQuantity;
        }
        System.out.println("Total amount: " + totalAmount + " €");
    }

            public void displayPizzaAttributes (Pizza pizza){
                System.out.println(this.orderNumber + ":" + this.customer.getNumber() + ":" + pizza.getName() + ":" +
                        pizza.pizzasQuantity);
            }

        }


