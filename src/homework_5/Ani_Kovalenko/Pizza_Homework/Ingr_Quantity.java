package homework_5.Ani_Kovalenko.Pizza_Homework;

public class Ingr_Quantity extends Ingredients {
    boolean[] arrayIngr = new boolean[7];
    int index = 0;

    boolean quantityDefinition() {
            if(tomatoPaste == true){
                this.tomatoPaste = arrayIngr[index];
                ++index;
            }if(cheese == true){
                arrayIngr[index] = cheese;
                index++;
            }if(salami == true){
                arrayIngr[index] = salami;
                index++;
            }if(bacon == true){
                arrayIngr[index] = bacon;
                index++;
            } if(garlic == true){
                arrayIngr[index] = garlic;
                index++;
            }if(corn == true){
                arrayIngr[index] = corn;
                index++;
            }if(pepperoni == true){
                arrayIngr[index] = pepperoni;
                index++;
            }if(olives == true){
                arrayIngr[index] = olives;
                index++;
            }
        return true;
    }
}
