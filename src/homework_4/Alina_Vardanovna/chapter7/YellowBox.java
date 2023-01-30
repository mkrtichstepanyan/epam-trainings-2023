package homework_4.Alina_Vardanovna.chapter7;

import homework_4.Alina_Vardanovna.chapter6.Box;

public class YellowBox {

    public double width;
    public double height;
    public double depth;
    public static String color = "red";

    public YellowBox(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public double volume() {
        return width * height * depth;
    }


    public boolean equalTo(Box box) {
        return box.width == this.width
                && box.height == this.height
                && box.depth == this.depth;
    }

    public static void meth() {
        System.out.println("method");
    }

}
