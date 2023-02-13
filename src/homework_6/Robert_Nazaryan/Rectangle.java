package homework_6.Robert_Nazaryan;

public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }

    //overrid area for rectangle
    double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
