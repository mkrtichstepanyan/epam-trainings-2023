package homework_4.Qnarik_Khachatryan.chapter_6;

class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();     //declare reference to object (Box mybox1) and  allocate a Box object
        Box mybox2 = new Box();
        double vol;

        //assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // assign different values to mybox2's instance variables
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // compute volume of first box
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume is " + vol);

        //compute volume of second box
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}
