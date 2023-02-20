package homework_6.Vahe_Vardanyan.Chapter_8;

 class Box1 {
    private  double width;
    private double height;
    private double depth;

    Box1(Box1 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box1(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box1(double len){
        width = height = depth = len;
    }
   double volume(){
        return width * height * depth;
   }
}

