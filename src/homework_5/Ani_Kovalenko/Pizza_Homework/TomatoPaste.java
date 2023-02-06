package homework_5.Ani_Kovalenko.Pizza_Homework;

import java.util.Scanner;

public class TomatoPaste extends Ingredients {
    void checkRequirement() {
        System.out.println("Do you want to add a Tomato Paste? y/n");
        Scanner console = new Scanner(System.in);
        char choice = console.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            tomatoPaste = true;
        }
    }

}
