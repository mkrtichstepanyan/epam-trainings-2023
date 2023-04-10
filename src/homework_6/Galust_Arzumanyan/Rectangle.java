package homework_6.Galust_Arzumanyan;

class Rectangle extends Figure{

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("Inside area for renctagle");
        return dim1 * dim2;
    }
}
