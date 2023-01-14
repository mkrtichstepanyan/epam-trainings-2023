package homework_1.Armen_Martirosyan;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (int i = 0; i < 3; i++) {
            int y=-1;
            System.out.println("y is: " +y);

            y=100;
            System.out.println("y is now: " +y);
        }
    }
}
