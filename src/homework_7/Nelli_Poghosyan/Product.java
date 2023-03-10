package homework_7.Nelli_Poghosyan;

public abstract class Product {
    private int quantity;
    private String name;
    private Ingredient[] ingredients;
    private ProductType productType;
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private int index;

     public Product(String name, ProductType type, int quantity) {
        this.name = name;
        this.productType = type;
        this.quantity = quantity;
     }

    public Product(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
    public ProductType getProductType() {
        return productType;
    }
    public double calculatePrice() {
        double ingredientPrice = 0.0;
         if(ingredients!=null){
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }}
        return getProductType().getPrice() + ingredientPrice;
    }

    public int getIndex() {
        return index;
    }
}
