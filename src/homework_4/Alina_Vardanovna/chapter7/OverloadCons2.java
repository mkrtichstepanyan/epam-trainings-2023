package homework_4.Alina_Vardanovna.chapter7;

public class OverloadCons2 {

    public static void main(String[] args) {

        OverloadCons2Demo myBox1 = new OverloadCons2Demo(10, 20, 15);
        OverloadCons2Demo myBox2 = new OverloadCons2Demo();
        OverloadCons2Demo myCube = new OverloadCons2Demo(7);
        OverloadCons2Demo myClone = new OverloadCons2Demo(myBox1);

        double vol;
        vol = myBox1.volume();
        System.out.println("Առաջին արկղի ծավալը " + vol + "է:");
        vol = myBox2.volume();
        System.out.println("Երկրորդ արկղի ծավալը " + vol + "է:");
        vol = myCube.volume();
        System.out.println("Խորանարդի ծավալը " + vol + "է:");
        vol = myClone.volume();
        System.out.println("Կլոնավորված արկղի ծավալը " + vol + "է:");

    }
}
