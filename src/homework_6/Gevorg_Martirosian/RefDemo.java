package homework_6.Gevorg_Martirosian;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("volume of weightBox equals: " + vol);
        System.out.println("weight of weightBox equals: " + weightBox.weight);

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("volume of plainBox equals: " + vol);

        //there is error in next operator. the weight isn't defined in plainBox
        //System.out.println("weight of plainBox equals: " + plainBox.weight);
    }
}
