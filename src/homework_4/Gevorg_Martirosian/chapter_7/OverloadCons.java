package homework_4.Gevorg_Martirosian.chapter_7;

class OverloadCons{
    public static void main(String[] args) {
        //create box objects with using different constructors
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        double vol;

        //calculate volume of the first box
        vol = myBox1.volume();
        System.out.println("volume of myBox1 equals: " + vol);

        //calculate volume of the first box
        vol = myBox2.volume();
        System.out.println("volume of myBox2 equals: " + vol);

        //calculate volume of cube
        vol = myCube.volume();
        System.out.println("volume of myCube equals: " + vol);
    }
}
