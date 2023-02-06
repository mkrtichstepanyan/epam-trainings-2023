package homework_5.Ani_Kovalenko.Pizza_Homework_2;

import java.util.Scanner;

public class Order {
    //Order Number
    private Customer customer;
    //Quantity
    //type
    //list of items

    String pizzaName;
    private static int orderNumber = 4000;
    int quantity;
    String pizzaType;
    String tomatoPaste, cheese, salami, bacon, garlic, corn, pepperoni, olives;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber++;
    }


    String setPizzaName() {
        Scanner console = new Scanner(System.in);
        pizzaName = console.next();
        if (pizzaName.length() >= 4 && pizzaName.length() <= 20) {
            //tuyl tur latin characters
        } else {
            // pizzaName = customer_name_n ........n-index number of the pizza in the order.
        }
        return pizzaName;
    }

    int setQuantity() {
        Scanner console = new Scanner(System.in);
        System.out.println("How many pcs do you want to order?");
        quantity = console.nextInt();
        if (quantity >= 11) {
            System.out.println("More than 10 items are not allowed to order");
        }
        return quantity;
    }

    void chooseType() {
        Scanner console = new Scanner(System.in);
        System.out.println("Which type of pizza do you prefer? regular/closed");
        String choice = console.next();
//        if (choice.equals("regular")) {
//            pizzaType = "regular";
//        } else if (choice == "closed") {
//            pizzaType = "closed/Calzone";
//        }
    }

    void addPizza(Pizza pizza) {
        if (pizza.getPizzaName().length() <= 4 || pizza.getPizzaName().length() >= 20) {
            pizza.setPizzaName(customer.getName() + "_" + pizza.getId());
        }
    }

    void addIngredient() {
        int index = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Here is the list of ingredients: tomato paste; cheese; salami; bacon; garlic; " +
                "corn; pepperoni; olives");
        System.out.println("No more than 7 are not allowed to add.");
        do {
            System.out.println("Enter the name of ingredient which you want to add.");
            String choice = console.next();
            String[] array = new String[7];
            array[index++] = choice;
        } while (index == 6);
        System.out.println("The pizza is already full");

//            void addToArray () {
//                String[] array = new String[7];
//                for (int index = 0; index <= 6; index++) {
//                    array[index++] = choice;
//                }
//            }
    }
}
