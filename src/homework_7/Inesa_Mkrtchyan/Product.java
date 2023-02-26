package homework_7.Inesa_Mkrtchyan;

public abstract class  Product {
    protected String name;
    protected Ingredient[] ingredients;
    protected int quantity;
    public abstract double calculatePrice();
    public abstract void printProductSpecialInfo();

    public abstract Ingredient[] getIngredients();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
