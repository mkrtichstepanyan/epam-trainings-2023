package homework_4.Galust_Arzumanyan.chapter_6;


// This method is used to demonstrate parameterized method
class Box5 {
    double weight, height, depth;

    double volume() {
        return weight * height * depth;
    }

    void setDim(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        mybox1.setDim(5, 6, 7);
        mybox2.setDim(8, 9, 10);

        System.out.println(" Volume is " + mybox1.volume());
        System.out.println(" Volume is " + mybox2.volume());

    }

}


