package homework_6.Varsik_Pijoyan.chapter_8.AbstractClasses;

class RectangleAbstr extends FigureAbstr{
    RectangleAbstr(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

