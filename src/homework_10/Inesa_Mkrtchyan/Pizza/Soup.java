package homework_10.Inesa_Mkrtchyan.Pizza;

import homework_10.Inesa_Mkrtchyan.Ex.MyException;

public class Soup extends Product {
    private final int MAX_ALLOWED_INGREDIENTS = 5;
    public Soup(String name, Ingredient[] ingredients, int quantity){
        this.quantity = quantity;
        this.name = name;
        this.ingredients = new SoupIngredient[MAX_ALLOWED_INGREDIENTS];
        for(int i = 0; i < MAX_ALLOWED_INGREDIENTS; i++){
            this.ingredients[i] = ingredients[i];
        }
    }
    public void addIngredient(Ingredient ingredient) throws MyException {
        if(ingredients.length == 7) {
            throw new MyException("Soup is full!!!!");
            //System.out.println("Soup is full!!!!");
            //return;
        }
        for(int i = 0; i < ingredients.length; i++){
            if(ingredients[i].name == ingredient.name){
                throw new MyException("You already have ingredient: " + ingredient.getName());
                //System.out.println("You already have this ingredient");
            }
            else{
                ingredients[i] = ingredient;
                return;
            }
        }
    }
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return ingredientPrice;
    }

    public void printProductSpecialInfo() {}

    @Override
    public Ingredient[] getIngredients() {
        return ingredients;
    }

}
