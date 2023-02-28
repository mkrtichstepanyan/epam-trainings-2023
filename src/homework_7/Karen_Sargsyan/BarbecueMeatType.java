package homework_7.Karen_Sargsyan;

public class BarbecueMeatType extends ItemType {
    public static final BarbecueMeatType PIG_MEAT = new BarbecueMeatType("Pig Meat", 7);
    public static final BarbecueMeatType CHICKEN_MEAT = new BarbecueMeatType("Chicken Meat", 5);
    public static final BarbecueMeatType FISH_MEAT = new BarbecueMeatType("Fish Meat", 6);

    BarbecueMeatType(String name, double price) {
        super(name, price);
    }

}
