package homework_5.Pizzeria;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private  int orderId;

  private final   Customer customer;

    private final List<Pizza>pizzas;

    public Order(Customer customer){
       this.orderId=(int)(orderId+Math.random()*10000);
        this.customer=customer;
        this.pizzas=new ArrayList<>();

    }
    public void addPizza(Pizza pizza){
        this.pizzas.add(pizza);
    }
    public void printCheck() {
        System.out.println("-----------------------------------");
        System.out.println("Order: " + this.orderId);
        System.out.println("Client: " + this.customer.getCustomerId());
        System.out.println("Order time: " + LocalDateTime.now());
        double total = 0.0;
        for (Pizza pizza : this.pizzas) {
            System.out.println("Name: " + pizza.getPizzaName());
            System.out.println("--------------------------------");

            double price = 1.0;
            if (pizza.getPizzaType().equals("Calzone")) {
                price += 0.5;
                System.out.println("Pizza  (Calzone) " + price + " €");
            } else {
                System.out.println("Pizza Base  " + price + " €");
            }

            for (String ingredient : pizza.getIngredients()) {
                double ingredPrice = switch (ingredient) {
                    case "Tomato paste" -> 1.0;
                    case "Cheese" -> 1.0;
                    case "Salami" -> 1.5;
                    case "Bacon" -> 1.2;
                    case "Garlic" -> 0.3;
                    case "Corn" -> 0.7;
                    case "Pepperoni" -> 0.6;
                    case "Olives" -> 0.5;
                    default -> 0.0;
                };
                price += ingredPrice;
                System.out.println(ingredient + " " + ingredPrice + " €");
            }

            System.out.println("--------------------------------");
            System.out.println("Amount: " + price + " €");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.println("--------------------------------");

            total += price * pizza.getQuantity();
        }

        System.out.println("Total amount: " + total + " €");
        System.out.println("_______________________________");
    }

    public void display(){
      for(Pizza pizza:this.pizzas){
          System.out.println("["+orderId+":"+customer.getCustomerName()+":"+pizza.getPizzaName()+":"+pizza.getQuantity()+"]");
      }

        }

    }



