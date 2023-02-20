package homework_6.DIana_Melkonyan.chapter_8;

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
