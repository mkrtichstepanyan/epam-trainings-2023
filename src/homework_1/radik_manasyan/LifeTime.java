package homework_1.radik_manasyan;

public class LifeTime {
    public static void main(String[] args) {
        for(int x = 0; x < 3; x++){
            int y = -1;
            System.out.println("y = " + y);
            y = 100;
            System.out.println("Now y = " + y);
        }
    }
}
