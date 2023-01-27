package homework_4.Galust_Arzumanyan.chapter_6;


// This method is used to demonstrate returns the value of the box
class Box4 {
    double weight, height, depth;

    double volume() {
        return weight * height * depth;

    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();

        mybox1.weight = 5;
        mybox1.height = 6;
        mybox1.depth = 7;

        mybox2.weight = 8;
        mybox2.height = 9;
        mybox2.depth = 10;

        System.out.println(" Volume is " + mybox1.volume());
        System.out.println(" Volume is " + mybox2.volume());

    }

}


