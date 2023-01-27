package homework_3.Ani_Kovalenko.Chapter_5;

import javax.sound.midi.Soundbank;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i equals to ZERO");
                    break;
                case 1:
                    System.out.println("i equals to ONE");
                    break;
                case 2:
                    System.out.println("i equals to TWO");
                    break;
                case 3:
                    System.out.println("i equals to THREE");
                    break;
                case 4:
                    System.out.println("i equals to FOUR");
                    break;
                default:
                    System.out.println("i is more than 4");
            }
        }
    }
}
