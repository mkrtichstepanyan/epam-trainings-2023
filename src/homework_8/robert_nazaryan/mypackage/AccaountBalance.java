package homework_8.robert_nazaryan.mypackage;

public class AccaountBalance {
    public static void main(String[] args) {

        Balance[] current = new Balance[3];
        current[0] = new Balance("Poxos", 123.23);
        current[1] = new Balance("Petros", 157.02);
        current[2] = new Balance("Vzgo", -12.33);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
