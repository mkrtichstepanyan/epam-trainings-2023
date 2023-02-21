package homework_4.Galust_Arzumanyan.homework_4_1.chapter_7;


// This method is used to demonstrate that box allows one object to initialize another
class Box1 {
    double width, height, depth;

    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println(" Volume of mybox1 is " + vol);
        vol = mybox2.volume();
        System.out.println(" Volume of mybox2 is" + vol);
        vol = myclone.volume();
        System.out.println(" Volume of clone is " + vol);
    }
}