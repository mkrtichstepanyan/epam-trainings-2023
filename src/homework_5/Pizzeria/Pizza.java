package homework_5.Pizzeria;
import java.util.ArrayList;
import java.util.List;
public class  Pizza{
    private static final int MAX_SIZE=10;
    private  String pizzaName;
    private String pizzaType;
    private int quantity;
    private List <String> ingredients;



    public Pizza(String pizzaName,String pizzaType,int quantity,Customer customer){
        if(quantity<MAX_SIZE){
            if(pizzaName.length()<4||pizzaName.length()>20)
            {
                this.pizzaName=customer.getCustomerName()+ "_ "+customer.getCustomerId();
            }
            else
                this.pizzaName=pizzaName;
            this.pizzaType=pizzaType;
            this.quantity=quantity;
            this.ingredients=new ArrayList<>();
        }
        else {
            System.out.println("Please order 10 pizza");
            System.exit(1);
        }

    }

    public void addIngredients(String ingredient){

        if(this.ingredients.size()>=7){
            System.out.println("Pizza ingredients is already full");
        } else if (this.ingredients.contains(ingredient)){
            System.out.println("Not allowed to repeat ingredients");
        }
        else
            this.ingredients.add(ingredient);

        }



    public String getPizzaName(){
        return pizzaName;
    }
    public String getPizzaType(){
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }
    public List<String> getIngredients() {
        return this.ingredients;
    }



}