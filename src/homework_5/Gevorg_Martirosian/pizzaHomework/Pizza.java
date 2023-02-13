package homework_5.Gevorg_Martirosian.pizzaHomework;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private List<String> ingredients;
    private String type;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Pizza(String name, String type, int count, Customer customer) {
       if (count < 10) {
           if (name.length() < 4 || name.length() > 20) {
               this.name = customer.getName() + "_" + customer.getCustomerNumber();
           } else {
               this.name = name;
           }
           this.ingredients = new ArrayList<>();
           this.type = type;
           this.count = count;

       } else {
            System.out.println("Sorry, but you can not order more than 10 pizzas");
            System.exit(1);
        }
    }

    public void addIngredients(String ingredient) {
      if (ingredients.size() >= 7) {
          System.out.println("Pizza is already full");
      }
      if(ingredients.contains(ingredient)) {
          System.out.println("This ingredient already exist in the list, please check again");

      } else {
          ingredients.add(ingredient);
      }
    }
}
