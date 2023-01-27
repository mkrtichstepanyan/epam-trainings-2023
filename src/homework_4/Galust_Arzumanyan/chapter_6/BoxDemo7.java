package homework_4.Galust_Arzumanyan.chapter_6;


// This method is used to demonstrate a parameterized constructor to initialize the dimensions of a box
class Box7 {
    double weight, height, depth;

    double volume() {
        return weight * height * depth;

    }

    Box7(double w, double h, double d) {
        this.weight = w;
        this.height = h;
        this.depth = d;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(5, 6, 7);
        Box7 mybox2 = new Box7(8, 9, 10);


        System.out.println(" Volume is " + mybox1.volume());
        System.out.println(" Volume is " + mybox2.volume());

    }

}



