package homework_9.Eduard_Eghiazaryan.chaper_12.enums;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple apple1, apple2, apple3;
        System.out.println("Here are all apple constants" + " and their ordinal values");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        apple1 = Apple.RedDel;
        apple2 = Apple.GoldenDel;
        apple3 = Apple.RedDel;
        System.out.println();

        if (apple1.compareTo(apple2) < 0) {
            System.out.println(apple1 + " comes before " + apple2);
        }

        if (apple1.compareTo(apple2) > 0) {
            System.out.println(apple2 + " comes before " + apple1);
        }
        if (apple1.compareTo(apple3) == 0) {
            System.out.println(apple1 + " equals " + apple3);
        }

        System.out.println();

        if (apple1.equals(apple2)) {
            System.out.println("Error");
        }
        if (apple1.equals(apple3)) {
            System.out.println(apple1 + " equals " + apple3);
        }
        if (apple1 == apple3) {
            System.out.println(apple1 + " == " + apple3);
        }
    }

}
