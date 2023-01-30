package homework_4.Levon_Harutyunyan.Chapter_7;

public class BoxClone {
    double width;
    double height;
    double depth;

    BoxClone(BoxClone ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxClone() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxClone(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxClone(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}

class OverloadCons2 {
    public static void main(String[] args) {
        BoxClone mybox1 = new BoxClone(10,20, 15);
        BoxClone mybox2 = new BoxClone();
        BoxClone mycube = new BoxClone(7);
        BoxClone myclone = new BoxClone(mycube);

        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mycube.volume();
        System.out.println("Volume of mycub is " + vol);

        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);


    }
}
