package homework_1.Ruzanna_Marutyan;
//Demonstrate dynamic initialization.
class DynInit {
    public static void main (String args[]) {
        double a=3.0, b=4.0;
        // c is dynamically initialized
        double c=Math.sqrt(a*a+b*b);//9+16=25 The square root of a number is the factor that we can multiply by itself to get that number.
        // The symbol for square root is \sqrt{ } square root of, end square root .

        System.out.println("Hypotenuse is " +c);

    }
}
