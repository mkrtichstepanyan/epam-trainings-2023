package homework_8.homework_8_liana_gevorgyan.Pizza;

public class Menu implements IPrintable{
    @Override
    public void print() {
        System.out.println("******** MENU ********");
        System.out.println("========Drinks=======");
        System.out.println(DrinkType.BEER.getName() + "......" + DrinkType.BEER.getPrice() + "$");
        System.out.println(DrinkType.VINE.getName() + "......" + DrinkType.VINE.getPrice() + "$");
        System.out.println(DrinkType.APEROL.getName() + "......" + DrinkType.APEROL.getPrice() + "$");
        System.out.println(DrinkType.BRANDY.getName() + "......" + DrinkType.BRANDY.getPrice() + "$");
        System.out.println("======Pizza Types=====");
        System.out.println(PizzaType.CALZONE.getName() + "......" + PizzaType.CALZONE.getPrice() + "$");
        System.out.println(PizzaType.REGULAR.getName() + "......" + PizzaType.REGULAR.getPrice() + "$");
        System.out.println("==Additional Ingredients==");
        System.out.println(Ingredient.TOMATO_PASTE.getName() + "......" + Ingredient.TOMATO_PASTE.getPrice() + "$");
        System.out.println(Ingredient.CHEESE.getName() + "......" + Ingredient.CHEESE.getPrice() + "$");
        System.out.println(Ingredient.SALAMI.getName() + "......" + Ingredient.SALAMI.getPrice() + "$");

        System.out.println("******** MENU ********");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
