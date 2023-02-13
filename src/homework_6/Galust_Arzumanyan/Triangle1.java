package homework_6.Galust_Arzumanyan;

class Triangle1 extends Figure1{
    Triangle1(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("Inside area for trangle");
        return dim1 * dim2 / 2;
    }
}
