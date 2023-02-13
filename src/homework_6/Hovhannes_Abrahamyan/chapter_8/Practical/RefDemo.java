package chapter_8.Hovhannes_Abrahamyan.chapter_8.Practical;

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box painBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is: " + vol);
        System.out.println("Weight of weightBox is: " + weightBox.weight);
        System.out.println();

        painBox = weightBox;
        vol = painBox.volume();
        System.out.println("Volume of painBox is: " + vol);
//        System.out.println("Weight of painBox is: " + painBox.weight); //invalid
    }
}