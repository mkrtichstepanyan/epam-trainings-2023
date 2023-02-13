package homework_6.DIana_Melkonyan.chapter_8;

 class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b){
        super(a,b);
    }
    //override area for rectangle

     @java.lang.Override
     double area() {
         System.out.println("Inside Area for Rectangle1");
         return dim1 * dim2;
     }
 }
