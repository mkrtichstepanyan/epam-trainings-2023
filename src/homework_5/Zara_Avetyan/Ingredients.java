package homework_5.Zara_Avetyan;

import java.util.Scanner;

public class Ingredients {
    String ingredients;
    double price;
    boolean c = true;
    int[] choose = new int[8];

    static Scanner scanner = new Scanner(System.in);

    public Ingredients(String ingredients, double price) {
        this.ingredients = ingredients;
        this.price = price;
    }

    public Ingredients() {
    }

    public int[] chooseIngredients() {
        Ingredients ingr[] = Pizza.ingr;
        int n;
        int j = 0;
        boolean k = false;
        System.out.println("Please choose ingredients:");
        do {
            for (int i = 0; i < ingr.length; i++) {
                System.out.println((i + 1) + ". " + ingr[i].ingredients + ": " + ingr[i].price + "€");
            }
            System.out.println("Press number 1-8");
            n = scanner.nextInt();
            for (int i = 0; i < choose.length; i++) {
                if (n == choose[i]) {
                    k = true;
                }
            }
            if (k) {
                System.out.println("You already have that ingredient.");
            } else {
                choose[j] = n;
                j++;
            }
            k = false;
            if (choose[choose.length - 1] != 0) {
                c = false;
                System.out.println("The pizza is already full");
            } else {
                System.out.print("Do you want add ingredient? press y/n: ");
                if (!scanner.next().equals("y")) c = false;
            }
        } while (c);
        return choose;
    }
}
