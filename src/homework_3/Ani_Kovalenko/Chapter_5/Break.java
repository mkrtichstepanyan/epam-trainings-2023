package homework_3.Ani_Kovalenko.Chapter_5;

import javax.sound.midi.Soundbank;

public class Break {
    public static void main(String[] args) {
        boolean b = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("before the break");
                    if (b) break second;
                    System.out.println("this will not execute");
                }
                System.out.println("this will not execute");
            }
            System.out.println("will execute");
        }
    }
}
