package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate using break to exit while loop
class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 55) {
            if (i == 10) break; // terminate loop of i is 10
            System.out.println(" i: " + i);
            i++;
        }
        System.out.println(" Loop Complete. ");
    }
}
