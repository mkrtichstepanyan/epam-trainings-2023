package homework_4.Galust_Arzumanyan.chapter_6;


// This method is used to demonstrate a constructor to initialize the dimensions of a box
class Box6 {
    double weight, height, depth;

    double volume() {
        return weight * height * depth;

    }

    Box6() {
        System.out.println(" Constructing Box ");
        weight = 5;
        height = 6;
        depth = 7;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();


        System.out.println(" Volume is " + mybox1.volume());
        System.out.println(" Volume is " + mybox2.volume());

    }

}



