package homework_6.gohar_hakobyan.chapter_8;

public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(Box ob) {
        super(ob);
    }

    BoxWeight(double w, double h, double d) {
        super(w, h, d);
    }


    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super();
        weight = m;
    }

    double volume() {
        return width * height * depth;
    }


    // Constructor BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, double c) {
        double width = w;
        double height = h;
        double depth = d;
        double color = c;

    }
}
