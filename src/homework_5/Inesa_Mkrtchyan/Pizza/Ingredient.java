package homework_5.Inesa_Mkrtchyan.Pizza;

public class Ingredient {
    private String name;
    private double amount;
    public Ingredient(String name,double amount){
        this.name = name;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printIngredientInfo(){
        System.out.println( this.name + " : " + this.amount + "$ ");
    }
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
