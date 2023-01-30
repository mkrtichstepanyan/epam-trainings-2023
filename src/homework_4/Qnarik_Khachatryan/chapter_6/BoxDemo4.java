package homework_4.Qnarik_Khachatryan.chapter_6;

// return volume, not print
class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assign different values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //get volume of first box
        vol = mybox1.volumeReturn();
        System.out.println("Volume is " + vol);

        // more efficiently because there is  no need for the vol variable.
//        System.out.println("Volume is " + mybox1.volumeReturn());

        //get volume of second box
        vol = mybox2.volumeReturn();
        System.out.println("Volume is " + vol);

        // more efficiently because there is  no need for the vol variable.
//        System.out.println("Volume is " + mybox2.volumeReturn());
    }
}
