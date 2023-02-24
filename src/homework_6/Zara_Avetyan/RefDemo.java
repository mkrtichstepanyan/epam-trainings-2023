package homework_6.Zara_Avetyan;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Volume of weightBox is " + vol);
        System.out.println("Volume of weightBox is " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;

        vol = plainBox.volume();
        System.out.println("Volume of plainBox is " + vol);
    }
}
