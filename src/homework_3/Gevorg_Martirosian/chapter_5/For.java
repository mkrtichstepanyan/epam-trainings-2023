package Gevorg_Martirosian.chapter_5;

//demonstration of for loop
public class For {
    public static void main(String[] args) {
        int n;
        for (n = 10; n > 0; n--) {
            System.out.println("current number " + n);
        }

        //here the variable k initialised inside for loop
        for (int k = 55; k < 100; k += 10) {
            System.out.println("current number " + k);
        }
    }
}
