package homework_5.garik_gharibyan;

  class Box {
    double wight;
    double height;
    double dept;

    Box(double w, double h, double d) {
        this.wight = w;
        this.height = h;
        this.dept = d;
    }

    Box() {
        wight = -1;
        height = -1;
        dept = -1;
    }

    Box(double len) {
        wight = height = dept = len;
    }

    double value() {
        return wight * height * dept;
    }

}
    public class OverloadCons {
        public static void main(String[] args) {
            Box myBox1 = new Box(10,20,15);
            Box myBox2 = new Box();
            Box myCub = new Box(7);

            double vol;

            vol = myBox1.value();
            System.out.println("Value of myBox1 is " + vol);

            vol = myBox2.value();
            System.out.println("Value of myBox2 is " + vol);

            vol = myCub.value();
            System.out.println("Value of myCub is " + vol);

        }

}
