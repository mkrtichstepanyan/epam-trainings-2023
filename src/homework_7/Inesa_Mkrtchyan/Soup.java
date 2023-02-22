package homework_7.Inesa_Mkrtchyan;

public class Soup extends Product{
    private final int MAX_ALLOWED_INGREDIENTS = 5;
    public Soup(String name,Ingredient[] ingredients, int quantity){
        this.quantity = quantity;
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];
        for(int i = 0; i < MAX_ALLOWED_INGREDIENTS; i++){
            this.ingredients[i] = ingredients[i];
        }
    }
    public void addIngredient(Ingredient ingredient) {
        if(ingredients.length == 7) {
            System.out.println("Soup is full!!!!");
            return;
        }
        for(int i = 0; i < ingredients.length; i++){
            if(ingredients[i].name == ingredient.name){
                System.out.println("You already have this ingredient");
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

    public void printProductSpecialInfo() {

    }

    @Override
    public Ingredient[] getIngredients() {
        return ingredients;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
