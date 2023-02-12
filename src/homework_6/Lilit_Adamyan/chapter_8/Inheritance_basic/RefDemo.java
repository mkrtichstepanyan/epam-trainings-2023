package homework_6.Lilit_Adamyan.chapter_8.Inheritance_basic;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3,5,7,8.37);
        Box plainBox = new Box();
        double vol;

        vol = boxWeight.volume();
        System.out.println("Volume of weightBox is: " + vol);
        System.out.println();

        plainBox = boxWeight;
        vol = plainBox.volume();
        System.out.println("Volume of plainBox is: " + vol);


    }
}
