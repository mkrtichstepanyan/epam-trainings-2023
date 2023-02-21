package homework_4.Gevorg_Martirosian.chapter_6;

class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double volume;
        //setting the values to box object
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        //calculate the volume of box
        volume = myBox.height * myBox.width * myBox.depth;

        System.out.println("volume of the box: " + volume);
    }
}


