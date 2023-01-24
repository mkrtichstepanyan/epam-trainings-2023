package homework_4.Araksya_Ghazaryan.Chapter_6;

public class BoxDemo6 {
    public static void main(String[] args) {
        double vol;
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double volume;

        volume = myBox1.volume();
        System.out.println("Volume = " + volume);

        volume = myBox2.volume();
        System.out.print("Volume = " + volume);
    }
}

