package homework_6.Levon_Harutyunyan.Chapter_8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5,7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println(" Volume of weightBox is: " + vol);
        System.out.println(" Volume of weightBox is: " + weightBox.weigth);
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println(" Volume of plainBox is: " + vol);

         /*
            The following statement is invalid because plainbox
            does not define a weight member
         */
//        System.out.println(" Volume of plainBox is: " + weightBox.weigth);
    }
}
