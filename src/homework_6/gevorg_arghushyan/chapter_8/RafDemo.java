package homework_6.gevorg_arghushyan.chapter_8;

public class RafDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;
        vol = weightBox.volume();
        System.out.println("volume of weightBox " + vol);
        System.out.println("Weight of weightBox " + weightBox.weight);
        System.out.println();
        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("The volume of plainBox is equal " + vol);
        //System.out.println("The weight of plainBox is equal " + plainBox.weight); ERROR
    }
}
