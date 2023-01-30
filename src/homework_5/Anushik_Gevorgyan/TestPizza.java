package homework_5.Anushik_Gevorgyan;

public class TestPizza {
    public static void main(String[] args) {
        Order order1=new Order(new Customer("Mary",7717));
        Pizza margarita =new Pizza("Margarita","Calzone",2);
        margarita.addIngredient("Tomato paste ");
        margarita.addIngredient("Garlic ");
        margarita.addIngredient("Pepperoni ");
        margarita.addIngredient(" Bacon ");

        Pizza pepperoniOro =  new Pizza("PepperoniOro","Calzone",3);
        pepperoniOro.addIngredient("Tomato paste");
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");


        Order order2=new Order(new Customer("Daniel",4372));
        Pizza basePZZ=new Pizza("BasePZZ","Calzone",12);
        basePZZ.addIngredient("Salami");
        basePZZ.addIngredient("Bacon");
        basePZZ.addIngredient("Corn");
        basePZZ.addIngredient("Olives");

        order1.showPizzaAtributes((margarita));
        order1.showPizzaAtributes(pepperoniOro);
        order2.showPizzaAtributes(basePZZ);

        order1.addPizza(pepperoniOro);
        order1.addPizza(margarita);
        order1.printCheck();
        order2.addPizza(basePZZ);
        order2.printCheck();











    }
}
