package homework_8.aram_mehrabyan.mypack1;

public class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];
        current[0] = new Balance("K.JFielding", 123.23);
        current[1] = new Balance("Will tell", 157.02);
        current[2] = new Balance("Tomw Jackson", -12.33);
        for (int i = 0; i < 3; i++)
            current[i].show();
    }
}
