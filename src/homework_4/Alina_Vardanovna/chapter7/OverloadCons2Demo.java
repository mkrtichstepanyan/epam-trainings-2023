package homework_4.Alina_Vardanovna.chapter7;

public class OverloadCons2Demo {

    double width;
    double height;
    double depth;

    OverloadCons2Demo(OverloadCons2Demo ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    OverloadCons2Demo(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    OverloadCons2Demo() {
        width = -1;
        height = -1;
        depth = -1;
    }

    OverloadCons2Demo(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}
