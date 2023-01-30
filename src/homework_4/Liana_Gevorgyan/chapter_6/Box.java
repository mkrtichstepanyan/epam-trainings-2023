package homework_4.Liana_Gevorgyan.chapter_6;

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box ");
        width = 10;
        height = 10;
        depth = 10;
    }

    //compute and return volume
    double volume2() {
        return width * height * depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //compute and return volume
    double volume3() {
        return width * height * depth;
    }

    void volume(){
        System.out.print("Volume is ");
        System.out.println(width*height*depth);
    }
    double volume1(){
        return width*height*depth;
    }
    //set dimensions of box
    void  setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}




