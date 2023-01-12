package Anna_Manukyan;

//Demonstrate lifetime of variable
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.print("y is  " + y);
            y = 100;
            System.out.print("y is now " + y);
        }
    }
}
