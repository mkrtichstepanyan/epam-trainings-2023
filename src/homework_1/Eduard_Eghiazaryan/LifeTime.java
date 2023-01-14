package homework_1.Eduard_Eghiazaryan;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.printf("the value of y is " + y);
            y = 100;
            System.out.printf("now the value of y is" + y);
        }
    }
}
