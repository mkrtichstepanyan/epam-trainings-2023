package homework_6.Levon_Harutyunyan.Chapter_8;

public class Rectengle extends  Figure {
    Rectengle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Inside Area for Rectangle.");
        return  dim1 * dim2;
    }
}
