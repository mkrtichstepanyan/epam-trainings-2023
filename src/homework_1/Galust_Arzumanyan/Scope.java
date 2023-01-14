package homework_1.Galust_Arzumanyan;

// This method is used to demonstrate the variable visibility
class Scope {
    public static void main(String[] args) {
        int x = 11;
        if (x == 11) {
            int y = 15;
            System.out.println("Its True");
            x = y * 2;
        }
        // y = 100; // error: cannot find symbol
        System.out.println("x is " + x);
    }
}