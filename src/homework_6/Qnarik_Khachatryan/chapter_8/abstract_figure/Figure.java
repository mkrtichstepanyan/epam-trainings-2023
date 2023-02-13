package homework_6.Qnarik_Khachatryan.chapter_8.abstract_figure;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
