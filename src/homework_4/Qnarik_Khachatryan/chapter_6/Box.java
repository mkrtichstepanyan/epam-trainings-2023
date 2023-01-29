package homework_4.Qnarik_Khachatryan.chapter_6;

class Box {
    double width;
    double height;
    double depth;

    // display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    //compute  and return volume
    double volumeReturn() {
        return width * height * depth;
    }

    //sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
