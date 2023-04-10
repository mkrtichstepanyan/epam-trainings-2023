package homework_6.Qnarik_Khachatryan.chapter_8.abstract_figure;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    //override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
