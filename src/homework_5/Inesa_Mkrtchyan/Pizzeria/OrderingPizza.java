package Homework5.Inesa_Mkrtchyan.Pizzeria;

import java.util.Scanner;

public class OrderingPizza {
    public static Scanner inp = new Scanner(System.in);
    public static Ingredient[] createIngridientList() {
        Ingredient[] listofIng = new Ingredient[8];
        listofIng[0] = new Ingredient("Tomato paste", 1);
        listofIng[1] = new Ingredient("Cheese", 1);
        listofIng[2] = new Ingredient("Salami", 1.5);
        listofIng[3] = new Ingredient("Bacon", 1.2);
        listofIng[4] = new Ingredient("Garlic", 0.3);
        listofIng[5] = new Ingredient("Corn", 0.7);
        listofIng[6] = new Ingredient("Pepperoni", 0.6);
        listofIng[7] = new Ingredient("Olives", 0.5);

        return listofIng;
    }
    public static Ingredient AddIngridient() {
        Scanner inp = new Scanner(System.in);
        Ingredient[] all = createIngridientList();
        for (int i = 0; i < all.length; i++) {
            System.out.println("N - " + i);
            all[i].printIngredient();
        }
        System.out.println("press number 0-7");
        byte num = inp.nextByte();
        return all[num];
    }
    public static PizzaType chosePizzaType(){
        byte i = 0;
        System.out.println("you can choose one of two pizzas. Press 1 if you want Regular, 2 for Calzone");
        i = inp.nextByte();
        if (i == 2) {
            return new PizzaType("Calzone", 1.5);
        }else{
            return new PizzaType("Regular", 1);
        }
    }
    public static Pizza OrderPizza(){
        Pizza pizza = new Pizza();
        System.out.println("Input Pizza's name(If pizza have not name press 'n')");
        String cont = inp.next();
        if (cont.charAt(0) != 'n'){
            pizza.pizzaName = cont;
        }
        while (true) {
            pizza.addIngredient(AddIngridient());

            System.out.println("Do you want to add another ingridient? y/n");
            char temp = inp.next().charAt(0);
            if (temp == 'n') break;
        }
        pizza.addPizzaType(chosePizzaType());

        return pizza;
    }

}
