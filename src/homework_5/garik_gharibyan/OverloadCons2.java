package homework_5.garik_gharibyan;

class Box2 {
    double wight;
    double height;
    double dept;

    Box2(Box2 ob) {
        wight = ob.wight;
        height = ob.height;
        dept = ob.dept;
    }

    Box2() {
        wight = -1;
        height = -1;
        dept = -1;
    }

    Box2(double w, double h, double d) {
        wight = w;
        height = h;
        dept = d;
    }

    Box2(double len) {
        wight = height = dept = len;
    }

    double value() {
        return wight * height * dept;
    }
}

public class OverloadCons2 {

    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10, 20, 15);
        Box2 myBox2 = new Box2();
        Box2 myCub = new Box2(7);

        Box2 myClone = new Box2(myBox1);

        double vol;

        vol = myBox1.value();
        System.out.println("Value of myBox1 is " + vol);

        vol = myBox2.value();
        System.out.println("Value of myBox2 is " + vol);

        vol = myCub.value();
        System.out.println("Value of myCub is " + vol);

        vol = myClone.value();
        System.out.println("Value of myClone is " + vol);

    }

}
