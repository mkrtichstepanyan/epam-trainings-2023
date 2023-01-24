package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate using break to exit a loop
class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 77; i++) {
            if (i == 10) break; // terminate loop if i is 10
            System.out.println(" i: " + i);
        }
        System.out.println(" Loop Complete. ");
    }
}
