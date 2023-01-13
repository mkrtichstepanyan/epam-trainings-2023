package homework_1.gevorg_arghushyan;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++){
            int y = -1;
            System.out.println("The value of y is " + y);
            y = 100;
            System.out.println("Now the value of y is " + y);
        }
    }
}
