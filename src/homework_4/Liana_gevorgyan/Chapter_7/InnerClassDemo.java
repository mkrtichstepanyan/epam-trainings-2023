package homework_4.Liana_gevorgyan.Chapter_7;
//Demonstrate an inner class
class Outer{
    int outer_X = 100;
    void test(){
        Inner inner = new Inner ();
        inner.display();
    }
    //this is an inner class
    class Inner {
        void display()
        {
            System.out.println("display : outer_X = " + outer_X);
        }
    }
}
 class InnerClassDemo {
     public static void main(String[] args) {
         Outer outer  = new Outer();
         outer.test();
     }
}
