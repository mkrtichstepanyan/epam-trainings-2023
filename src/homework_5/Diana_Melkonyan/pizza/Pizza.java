package homework_5.Diana_Melkonyan.pizza;

public class Pizza {
    public static int MaxIngredients=7;
    private int index;
    private String name;
    private  String[]ingredients;
    private int ingredientCount;
    private String type;
    public int quantity;

    public Pizza(String name, String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
        this.ingredients=new String [MaxIngredients];
        this.ingredientCount=0;
    }

    public Pizza(String name, String type,int quantity, int index, Customer customer){
        if (name.length()<4 || name.length()>20){
            this.index=index;
            this.name=customer.getName() + " " + index;
        }else{
            this.name=name;

        }
        this.type=type;
        this.quantity=quantity;
        this.ingredients=new String [MaxIngredients];
        this.ingredientCount=0;
    }


    public void addIngredient(String ingredient){
        if(ingredientCount>=MaxIngredients){
            System.out.println("The pizza has already full");
            return;
        }
        for (int i = 0; i < ingredientCount; i++) {
            if(ingredients[i].equals(ingredient)){
                System.out.println("Check the order");
                return;
            }

        }
        ingredients[ingredientCount++]=ingredient;
    }

    public String[] getIngredients(){
        int newLenght=ingredientCount;
        String[] newIngredientArray=new String[newLenght];
        System.arraycopy(ingredients,0,newIngredientArray,0,ingredientCount);
        ingredients=newIngredientArray;
        return ingredients;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getIndex(){
        return index;
    }

}
