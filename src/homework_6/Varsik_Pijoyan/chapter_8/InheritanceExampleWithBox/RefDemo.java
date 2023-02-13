package homework_6.Varsik_Pijoyan.chapter_8.InheritanceExampleWithBox;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        BoxInh plainbox = new BoxInh();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is: " + vol);
        System.out.println("Weight of weightbox is: " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Volume of plainbox is: " + vol);
    }
}
