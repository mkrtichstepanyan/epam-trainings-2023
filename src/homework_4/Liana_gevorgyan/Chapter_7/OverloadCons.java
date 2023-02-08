package homework_4.Liana_gevorgyan.Chapter_7;

import homework_4.Roza_Petrosyan.task.B;

/* Here, Box defines three constructors to
initialize the dimensions of a box various ways*/
class Box{
    double width;
    double height;
    double depth;
    //constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when no dimensions specified
    Box(){
        width = -1; //use -1 to indicate
        height = -1; //an uninitialised
        depth = -1; //box
    }
    //Constructor used when cube is created
    Box (double len) {
        width = height = depth = len;
    }
    //compute and return value
   double valume () {
        return width*height*depth;
   }
}
 class OverloadCons {
     public static void main(String[] args) {
         //create boxes using the various constructors
         Box mybox1 = new Box(10,20,15);
         Box mybox2 = new Box ();
         Box mycube = new Box(7);

         double vol;
         //get volume of first box
         vol=mybox1.valume();
         System.out.println("Volume of mybox1 is " + vol);

         // get volume for second box
         vol = mybox2.valume();
         System.out.println("Volume of mybox2 is " + vol);

         // get volume of cube
         vol = mycube.valume();
         System.out.println("Volume of mycube is " + vol);
     }
}
