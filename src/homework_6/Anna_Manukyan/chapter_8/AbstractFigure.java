package homework_6.Anna_Manukyan.chapter_8;

//Using abstract methods ad classes
abstract class AbstractFigure {
    double dim1;
    double dim2;

    public AbstractFigure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();
}
