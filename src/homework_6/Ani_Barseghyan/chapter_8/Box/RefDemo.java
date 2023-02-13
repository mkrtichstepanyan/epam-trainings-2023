package homework_6.Ani_Barseghyan.chapter_8.Box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box planBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Weight of weightBox is " + weightBox.weight);
        System.out.println();

        planBox = weightBox;
        vol = planBox.volume();
        System.out.println("Volume of plainBox is " + vol);

        // System.out.println("Weight of plainBox is " + planBox.weight);
    }
}
