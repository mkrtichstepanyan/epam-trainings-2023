package homework_6.Samvel_Hakobyan.Chapter_8;

public class RefDemo {
    public static void main(String[] args) {

        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;


        vol = weightbox.Volume();
        System.out.println("Volume of weightbox is: " + vol);
        System.out.println("Weight of weightbox is: " + weightbox.weight);
        System.out.println();

        plainBox = weightbox;

        vol = plainBox.Volume();
        System.out.println("Volume of plainbox is: " + vol);
//        System.out.println("weight of plainbox is: " + plainBox.weight);
    }
}
