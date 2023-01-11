//demonstration of scopes
public class Scope {
    public static void main(String[] args) {
        int x;                //visible in whole code in main()
        x = 10;
        if (x == 10) {        //start of new scope
            int y = 20;       //this variable is visible only in this block

            //x and y are visible here
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100;            //error! y isn't visible here
        //variable x is already visible
        System.out.println("x equals " + x);



    }
}
