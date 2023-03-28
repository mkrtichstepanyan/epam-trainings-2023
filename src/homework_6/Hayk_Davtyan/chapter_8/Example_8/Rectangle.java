package homework_6.Hayk_Davtyan.chapter_8.Example_8;

import homework_6.Hayk_Davtyan.chapter_8.Example_8.Figure;

public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area for Rectangle.");
        return  dim1 * dim2;

    }
}
