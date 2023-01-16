package homework_2.Galust_Arzumanyan;

// This method is used to demonstrate several assigment operators
class OpEquals {
    public static void main(String[] args) {
        int a, b, c;
        a = 25;
        b = 22;
        c = 4;

        a -= 7; // a is 18
        b /= a - 5; // b is 1, a is 18
        c *= a * (b + 2); // c is 216, a is 18, b is 3

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
