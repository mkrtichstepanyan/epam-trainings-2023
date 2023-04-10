package homework_6.Galust_Arzumanyan;

class Trangle extends Figure{
    Trangle(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("Inside area for trangle");
        return dim1 * dim2 / 2;
    }
}
