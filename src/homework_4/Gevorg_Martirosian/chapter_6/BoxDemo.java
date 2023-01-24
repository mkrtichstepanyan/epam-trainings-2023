package homework_4.Gevorg_Martirosian.chapter_6;

class Box {
    double width;
    double height;
    double depth;

    //this is a default constructor for Box

    public Box() {
    }

    //this is a constructor for Box
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //method for calculating the volume of the box
    double volume() {
        return height * width * depth;
    }

    public void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

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


