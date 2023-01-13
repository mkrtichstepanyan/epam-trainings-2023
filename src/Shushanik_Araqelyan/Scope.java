package Shushanik_Araqelyan;

public class Scope {
    public static void main(String[] args) {



            {

                int X;
                X = 10;
                if (X == 10) {
                    int y = 20;
                    System.out.println("x and y" + X + "" + y);
                    X = (y * 2);
                    X = 100;
                }
                System.out.println("x is =" + X);
            }
        }
    }

