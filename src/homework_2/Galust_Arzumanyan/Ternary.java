package homework_2.Galust_Arzumanyan;


// This method is used to demonstrate ?.
class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        // Returns i because i < 0 is False
        k = i < 0 ? -i : i;
        System.out.println("Absalute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        // Teturns -i because i < 0 is true
        k = i < 0 ? -i : i;
        System.out.println("Absalute value of ");
        System.out.println(i + " is " + k);
    }


}