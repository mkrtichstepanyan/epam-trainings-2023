package homework_5.Zara_Avetyan;

public class Print extends Pizza {
    static double totalAmount;

    static {
        System.out.println("********************************");
        System.out.println("Order: " + Order.orderNumber());
        System.out.println("Client: " + Customer.getCustomerName());
    }

    void print(String pizzaName, int pizzaTypeIndexes, int[] ingredientsIndexes, int quantity) {
        double amount = pizzaType[pizzaTypeIndexes - 1].price;
        System.out.println("Name: " + pizzaName);
        System.out.println("--------------------------------");
        System.out.println("Pizza Base (" + pizzaType[pizzaTypeIndexes - 1].name + ") " + pizzaType[pizzaTypeIndexes - 1].price + "€");
        int i = 0;
        while (ingredientsIndexes[i] != 0) {
            amount += ingr[ingredientsIndexes[i] - 1].price;
            System.out.println(ingr[ingredientsIndexes[i] - 1].ingredients + " " + ingr[ingredientsIndexes[i] - 1].price + "€");
            i++;
        }

        System.out.println("--------------------------------");
        System.out.println("Amount: " + amount + "€");
        System.out.println("Quantity: " + quantity);
        System.out.println("--------------------------------");
        totalAmount += (quantity * amount);
    }

    void printTotalAmount() {
        System.out.println("Total amount: " + totalAmount + "€");
        System.out.println("********************************");
    }
}
