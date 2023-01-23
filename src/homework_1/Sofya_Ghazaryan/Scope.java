package homeworks.chapter3;

public class Scope {
    public static void main(String[] args) {
        int x; //known to all code within main

        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
            System.out.println("x is " + x);
        }
    }
}
