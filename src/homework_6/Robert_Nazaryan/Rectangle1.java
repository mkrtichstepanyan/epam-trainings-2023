package homework_6.Robert_Nazaryan;

class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b){
        super(a,b);
    }
    //override area for rectangle

     double area() {
         System.out.println("Inside Area for Rectangle1");
         return dim1 * dim2;
     }
 }
