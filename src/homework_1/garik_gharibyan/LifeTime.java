package homework_1.garik_gharibyan;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++){
            int y = -1;
            System.out.println("old y: " + y);

            y = 100;
            System.out.println("new y: " + y);
        }
    }
}
