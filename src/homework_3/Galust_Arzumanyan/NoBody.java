package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate
class NoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;

        // find midpoint  between i and j
        while (++i < --j) ; // no body in this loop

        System.out.println(" Midpoint is " + i);

    }
}
