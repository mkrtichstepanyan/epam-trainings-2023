package homework_8.Argishti_Mesropyan.mypack;

public class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[4];
        current[0] = new Balance("K. J. Fielding", 123.23);
        current[1] = new Balance("Will Tell", 157.02);
        current[2] = new Balance("Tom Jackson", 12.33);
        current[3] = new Balance("Hardy Boomer", -12.33);
        for (int i = 0; i < 4; i++){
            current[i].show();
        }
    }
}
