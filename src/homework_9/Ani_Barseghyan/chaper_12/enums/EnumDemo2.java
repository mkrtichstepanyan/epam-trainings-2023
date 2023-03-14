package homework_9.Ani_Barseghyan.chaper_12.enums;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple apple;

        System.out.println("Here are all Apple constants:");

        Apple[] allApples = Apple.values();
        for (Apple allApple : allApples) {
            System.out.println(allApple);
        }
        System.out.println();
        apple = Apple.valueOf("Winesap");
        System.out.println("apple contains " + apple);
    }

}
