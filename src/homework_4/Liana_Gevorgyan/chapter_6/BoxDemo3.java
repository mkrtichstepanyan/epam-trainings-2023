package homework_4.Liana_Gevorgyan.chapter_6;

 class BoxDemo3 {
     public static void main(String[] args) {
         Box mybox1 = new Box();
         Box mybox2 = new Box();
         //Assign Values to mybox1 's instance variables
         mybox1.width = 10;
         mybox1.height = 20;
         mybox1.depth = 15;
        /* assing different values to mybox2 's
        instance variables
         */
         mybox2.width = 3;
         mybox2.height = 6;
         mybox2.depth = 9;
         //display volume of first box
         mybox1.volume();

         //display volume of second box
         mybox2.volume();
     }
 }
