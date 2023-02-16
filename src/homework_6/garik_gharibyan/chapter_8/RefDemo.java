package homework_6.garik_gharibyan.chapter_8;

import homework_6.garik_gharibyan.chapter_8.Box;
import homework_6.garik_gharibyan.chapter_8.BoxWeight;

public class RefDemo {

    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = boxWeight.value();
        System.out.println("Value of boxWeight1 is "+ vol);
        System.out.println("Weight of boxWeight1 is "+ boxWeight.weight);
        System.out.println();

        vol = plainBox.value();
        System.out.println("PlainBox of plainBox is "+ vol);
//        System.out.println("Weight of plainBox is "+ plainBox.weight);   invalid statement
    }

}
