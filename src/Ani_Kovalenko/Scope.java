package Ani_Kovalenko;

public class Scope {
    public static void main(String[] args) {
        int x = 10;

        if (x == 10) {
            int y = 20;
            System.out.println("X and Y: " + x + " " + y);
            x = y * 2;
        }
        //y =  2; //is not visible
        System.out.print (x + " is visible");
    }
}
