package homework_4.Galust_Arzumanyan.chapter_6;


// This program is used to demonstrate box class
class Box1 {
    double weight, height, depth;
}

class BoxDemo {
    public static void main(String[] args) {
        Box1 mybox = new Box1();
        double vol;

        mybox.weight = 5;
        mybox.height = 6;
        mybox.depth = 7;

        vol = mybox.weight * mybox.height * mybox.depth;

        System.out.println(" Volume is " + vol);
    }
}
