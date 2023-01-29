package homework_4.Qnarik_Khachatryan.chapter_6;

class BoxDemo6 {
    public static void main(String[] args) {
        //declare, allocate and initialize BoxWithConstructor objects
        BoxWithConstructor mybox1 = new BoxWithConstructor();
        BoxWithConstructor mybox2 = new BoxWithConstructor();
        double vol;

        //gel volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
