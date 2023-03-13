package homework_11.Radik_Manasyan.chapter13;

public class Hypot {
    public static void main(String[] args) {
        double side1;
        double side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;
        hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("При заданной длине старон " +
                side1 + " и " + side2 + " гипотенуза равна " + hypot);
    }
}
