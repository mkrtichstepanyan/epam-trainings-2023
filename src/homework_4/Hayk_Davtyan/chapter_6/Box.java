package homework_4.Hayk_Davtyan.chapter_6;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //    void volume(){
//        System.out.print("Volume is ");
//        System.out.println(width * height * depth);
//    }
    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
