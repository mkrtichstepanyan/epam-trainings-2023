package homework_7.Ani_Kovalenko.Pizza_Abstract;

public class BurgerBreadType extends ItemType {
    public static final BurgerBreadType BLACK_BREAD = new BurgerBreadType("Black Bread", 0.5);
    public static final BurgerBreadType WHITE_BREAD = new BurgerBreadType("White Bread", 0.3);

    BurgerBreadType(String name, double price){
        super(name, price);
    }
}
