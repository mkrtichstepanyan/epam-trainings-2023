package homework_7.Inesa_Mkrtchyan;

public abstract class  Product {
    protected String name;
    protected Ingredient[] ingredients;
    protected int quantity;
    public abstract double calculatePrice();
    public abstract void printProductSpecialInfo();

    public abstract Ingredient[] getIngredients();

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getQuantity();
    public abstract void setQuantity(int quantity);
}
