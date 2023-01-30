package homework_4.Qnarik_Khachatryan.chapter_6;

class BoxDemo7 {
    public static void main(String[] args) {
        //declare, allocate and initialize BoxWithParamConstructor objects
        BoxWithParamConstructor mybox1 = new BoxWithParamConstructor(10, 20, 15);
        BoxWithParamConstructor mybox2 = new BoxWithParamConstructor(3, 6, 9);
        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
