package homework_4.Galust_Arzumanyan.homework_4_1.chapter_7;


// This method is used to demonstrate three constructors to initialize the dimensions of a box various ways
class Box {
    double width, height, depth;

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

class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println(" Volume of mybox1 is " + vol);
        vol = mybox2.volume();
        System.out.println(" Volume of mybox2 is " + vol);
        vol = mycube.volume();
        System.out.println(" Volume of mycube is " + vol);


    }
}