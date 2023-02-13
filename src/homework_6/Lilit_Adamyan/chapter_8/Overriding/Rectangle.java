package homework_6.Lilit_Adamyan.chapter_8.Overriding;

public class Rectangle extends Figure{
  Rectangle(double a,double b){
      super(a,b);
  }
  double area(){
      System.out.println("Inside Area for Rectangle.");
      return dim1 * dim2;
  }

}
