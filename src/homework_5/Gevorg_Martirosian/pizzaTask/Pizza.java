package homework_5.Gevorg_Martirosian.pizzaTask;

//class for making pizza
public class Pizza {
    //ingredients
    private boolean cheese;
    private boolean tomatoPaste;
    private boolean salami;
    private boolean bacon;
    private boolean garlic;
    private boolean corn;
    private boolean pepperoni;
    private boolean olives;
    private int pizzaCount;
    private String pizzaName;
    private String pizzaType;

    public boolean isCheese() {
        return cheese;
    }

    public boolean isTomatoPaste() {
        return tomatoPaste;
    }

    public boolean isSalami() {
        return salami;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isGarlic() {
        return garlic;
    }

    public boolean isCorn() {
        return corn;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isOlives() {
        return olives;
    }

    public int getPizzaCount() {
        return pizzaCount;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    //constructor for making pizza with ingredients user want
    public Pizza(String pizzaName, int pizzaCount, String pizzaType, boolean cheese, boolean tomatoPaste, boolean salami, boolean bacon, boolean garlic, boolean corn, boolean pepperoni, boolean olives) {
        this.cheese = cheese;
        this.tomatoPaste = tomatoPaste;
        this.salami = salami;
        this.bacon = bacon;
        this.garlic = garlic;
        this.corn = corn;
        this.pepperoni = pepperoni;
        this.olives = olives;
        this.pizzaCount = pizzaCount;
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;

    }

    //constructor for choosing pizza which is already exist
    public Pizza(String pizzaName, int pizzaCount, String pizzaType) {
        this.pizzaType = pizzaType;
        this.pizzaName = pizzaName;
        this.pizzaCount = pizzaCount;
        if (pizzaName.toUpperCase().equals("MARGARITA")) {
            tomatoPaste = true;
            pepperoni = true;
            garlic = true;
            bacon = true;
        } else if (pizzaName.toUpperCase().equals("PEPPERONIORO")) {
            tomatoPaste = true;
            cheese = true;
            pepperoni = true;
            olives = true;
        }
        else {
            System.out.println("unknown pizza name, please check, or make your own");
        }
    }

    public Pizza() {
    }

    //method for adding ingredients, if user forget to add anything to order
    public void addIngredient(String... ingredientName) {
        for (String el : ingredientName) {
            switch (el.toUpperCase()) {
                case "CHEESE":
                    if (cheese) {
                        System.out.println("the cheese is already added");
                    } else {
                        cheese = true;
                    }
                    break;
                case "TOMATO PASTE":
                    if (tomatoPaste) {
                        System.out.println("the tomato paste is already added");
                    } else {
                        tomatoPaste = true;
                    }
                    break;
                case "SALAMI":
                    if (salami) {
                        System.out.println("the salami is already added");
                    } else {
                        salami = true;
                    }
                    break;
                case "BACON":
                    if (bacon) {
                        System.out.println("the bacon is already added");
                    } else {
                        bacon = true;
                    }
                    break;
                case "GARLIC":
                    if (garlic) {
                        System.out.println("the garlic is already added");
                    } else {
                        garlic = true;
                    }
                    break;
                case "CORN":
                    if (corn) {
                        System.out.println("the corn is already added");
                    } else {
                        corn = true;
                    }
                    break;
                case "PEPPERONI":
                    if (pepperoni) {
                        System.out.println("the pepperoni is already added");
                    } else {
                        pepperoni = true;
                    }
                    break;
                case "OLIVES":
                    if (olives) {
                        System.out.println("the olives are already added");
                    } else {
                        olives = true;
                    }
                    break;
                default:
                    System.out.println("wrong ingredient name, try again");
            }
        }
    }
}
