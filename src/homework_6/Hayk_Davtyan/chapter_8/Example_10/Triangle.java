package homework_6.Hayk_Davtyan.chapter_8.Example_10;

 class Triangle extends Figure {
     Triangle(double a, double b){
         super(a,b);
     }

     double area(){
         System.out.println("Inside Area for Triangle.");
         return  dim1 * dim2 / 2;
     }
}
