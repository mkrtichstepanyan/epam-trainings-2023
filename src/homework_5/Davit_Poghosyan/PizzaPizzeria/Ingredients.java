package homework_5.Davit_Poghosyan.PizzaPizzeria;

public class Ingredients {
    private String ingredientName;
    private double ingredientValue;


    public Ingredients(){

    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getIngredientPrice(String ingredientName) {
        switch (ingredientName) {
            case "Tomato paste":
                ingredientValue = 1.0;
                break;
            case "Cheese":
                ingredientValue = 1.0;
                break;
            case "Salami":
                ingredientValue = 1.5;
                break;
            case "Bacon":
                ingredientValue = 1.2;
                break;
            case "Garlic":
                ingredientValue = 0.3;
                break;
            case "Corn":
                ingredientValue = 0.7;
                break;
            case "Pepperoni":
                ingredientValue = 0.6;
                break;
            case "Olives":
                ingredientValue = 0.5;
                break;
            default:
                ingredientValue=0;
        }
        return ingredientValue;
    }





}
