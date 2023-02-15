package homework_5.Liana_gevorgyan.Pizzeria;

public class Pizza {
    String type = "Regular";
    String name;
    int quantity = 1;
    String[] ingredients = new String[7];
    int ingredientIndex = 0;
    double price = 1.0;

    public Pizza(String name, String type, int quantity) {
        this.name = name;
        this.quantity = quantity;

        if (type.equals("Calzone") || type.equals("Regular")) {
            this.type = type;
            if (type.equals("Calzone"))
                price = price + 0.5;
        } else {
            System.out.println(type + " is unknown Pizza type provided, regular type will be used instead");
        }

    }

    public void addIngredient(String ingredient) {
        if (ingredientIndex >= 7) {
            System.out.println("Pizza is full");
            return;
        }

        for (int i = 0; i <= ingredientIndex; i++) {
            if (ingredient.equals(ingredients[i])) {
                System.out.println("Please check ingredients again, they can't be duplicated");
                return;
            }
        }

        ingredients[ingredientIndex] = ingredient;
        ingredientIndex++;
        price = price + getIngredientPrice(ingredient);

    }

    private double getIngredientPrice(String ingredient){
        switch (ingredient) {
            case "Tomato paste":
                //Cheese and tomato has the same price, those will be handled in one case
            case "Cheese":
                return 1;
            case "Salami":
                return 1.5;
            case "Bacon":
                return 1.2;
            case "Garlic":
                return 0.3;
            case "Corn":
                return 0.7;
            case "Pepperoni":
                return 0.6;
            case "Olives":
                return 0.5;
            default:
                System.out.println("We have no such ingredinets");
                return 0;
        }
    }

    public void print() {
        System.out.println("Name: " + name);

        System.out.println("____________________");
        double basePrice = 1;
        if (type.equals("Calzone"))
            basePrice = basePrice + 0.5;
        System.out.println("Pizza Base (" + type + ") " + basePrice + "$");
        for (int i=0; i<ingredientIndex; i++ ){
            System.out.println(ingredients[i] + " : " + getIngredientPrice(ingredients[i]) + "$");
        }
        System.out.println("____________________");
        System.out.println("Amount : " + price * quantity);
        System.out.println("Quantity: " + quantity);
    }

}
