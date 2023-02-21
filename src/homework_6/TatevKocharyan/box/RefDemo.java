package homework_6.TatevKocharyan.box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(2, 2, 2, 6);
        Box plainbox = new Box(3, 3, 3);
        double vol;
        vol = boxWeight.volum();
        System.out.println("boxweight" + vol);
        System.out.println(boxWeight.weight);
        System.out.println();

        plainbox = boxWeight;
        vol = plainbox.volum();
        System.out.println("vol of plainbox is" + vol);
        System.out.println(boxWeight.weight);

    }
}