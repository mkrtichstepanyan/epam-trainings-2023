package homework_6.Robert_Nazaryan;

class Triangle1 extends Figure1 {
     Triangle1(double a, double b) {
         super(a,b);
     }

     //override area for right triangle

     double area(){
         System.out.println("Inside Area for Triangle1");
         return dim1 * dim2 /2;
     }
 }
