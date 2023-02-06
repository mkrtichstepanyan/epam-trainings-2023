package homework_5.Ani_Kovalenko.Pizza_Homework;

public class PriceSetup extends Ingredients{
    void priceCalculation(){
        if(tomatoPaste){
            double tomatoPasteP = 1.0;
        } else if (cheese){
            double cheeseP = 1.0;
        }else if (salami){
            double salamiP = 1.5;
        } else if (bacon){
            double baconP = 1.2;
        } else if (garlic){
            double garlicP = 0.3;
        } else if(corn){
            double cornP = 0.7;
        } else if (pepperoni){
            double pepperoniP = 0.6;
        } else if (olives){
            double olivesP = 0.5;
        }
    }
}
