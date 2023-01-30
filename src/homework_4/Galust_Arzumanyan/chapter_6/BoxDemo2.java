package homework_4.Galust_Arzumanyan.chapter_6;


// This method is used to demonstrate two box object
class Box2 {
    double weight, height, depth;
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();
        double vol;
        double vol1;

        mybox1.weight = 5;
        mybox1.height = 6;
        mybox1.depth = 7;

        mybox2.weight = 8;
        mybox2.height = 9;
        mybox2.depth = 10;


        vol = mybox1.weight * mybox1.height * mybox1.depth;
        vol1 = mybox2.weight * mybox2.height * mybox2.depth;

        System.out.println(" Volume is " + vol);
        System.out.println(" Volume is " + vol1);
    }
}

