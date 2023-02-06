package homework_4.Liana_gevorgyan.Chapter_7;
//public int i;
//private double j;
//private int myMethod(int a, char b){
//
//        }
/* This program demonstrates the difference between public and private*/
class Test3 {
    int a; //default access
    public int b; // public access
    private int c; //private access
    //Methods to access c
    void setc(int i){// set c's value
        c =i;
    }
    int getc ()
    { return c;

    }
}
 class AccessTest {
     public static void main(String[] args) {
         Test3 ob = new Test3();
         //There are OK, a and b may be accessed directly
         ob.a = 10;
         ob.b = 20;
         //This is not OK and will cause an error
         //ob.c = 100; //error
         //You must access c throught its methods
         ob.setc(100); //OK
         System.out.println("a , b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
     }
}
