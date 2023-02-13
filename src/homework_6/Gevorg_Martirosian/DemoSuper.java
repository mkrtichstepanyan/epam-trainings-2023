package homework_6.Gevorg_Martirosian;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 myBox1 = new BoxWeight1(10,20,15,34.3);
        BoxWeight1 myBox2 = new BoxWeight1(2,3,4,0.076);
        BoxWeight1 myBox3 = new BoxWeight1();
        BoxWeight1 myCube = new BoxWeight1(3,2);
        BoxWeight1 myClone = new BoxWeight1(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("volume of myBox1 equals: " + vol);
        System.out.println("weight of myBox1 equals: " + myBox1.weight);

        vol = myBox2.volume();
        System.out.println("volume of myBox2 equals: " + vol);
        System.out.println("weight of myBox2 equals: " + myBox2.weight);

        vol = myBox3.volume();
        System.out.println("volume of myBox3 equals: " + vol);
        System.out.println("weight of myBox3 equals: " + myBox3.weight);

        vol = myClone.volume();
        System.out.println("volume of myClone equals: " + vol);
        System.out.println("weight of myClone equals: " + myClone.weight);

        vol = myCube.volume();
        System.out.println("volume of myCube equals: " + vol);
        System.out.println("weight of myCube equals: " + myCube.weight);
    }
}
