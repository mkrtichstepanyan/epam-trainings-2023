//demonstration of variable lifetime
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;         //variable y will be initialized in each step of loop
            System.out.println("y eqauls " + y);       //always equals -1
            y = 100;
            System.out.println("now y equals " + y);
        }
    }
}
