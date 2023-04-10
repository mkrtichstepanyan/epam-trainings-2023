package homework_6.Galust_Arzumanyan;

class Rectangle1 extends Figure1{
    Rectangle1(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("Inside area for rectangle");
        return dim1 * dim2;
    }
}
