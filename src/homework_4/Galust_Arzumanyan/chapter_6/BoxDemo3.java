package homework_4.Galust_Arzumanyan.chapter_6;


// This method is used to demonstrate inside the box class
class Box3 {
    double weight, height, depth;

    void volume() {
        double vol;
        vol = weight * height * depth;
        System.out.println(" Volume is " + vol);

    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        mybox1.weight = 5;
        mybox1.height = 6;
        mybox1.depth = 7;

        mybox2.weight = 8;
        mybox2.height = 9;
        mybox2.depth = 10;

        mybox1.volume();
        mybox2.volume();


    }
}

