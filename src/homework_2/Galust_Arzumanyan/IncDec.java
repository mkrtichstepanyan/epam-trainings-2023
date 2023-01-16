package homework_2.Galust_Arzumanyan;

// This method is used to demonstrate ++
class IncDec {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 7;
        b = 5;
        c = ++b; // c and b is 6
        d = a++; // d is 7, a is 8
        c++;  // c is 7
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

