package homework_4.Liana_gevorgyan.Chapter_7;
//Demonstrate variable-length arguments.

 class VarArgs {
    //vaTest() now uses a vararg
     static void vaTest1(int ...v){
         System.out.print(" Number of args: " + v.length + "Contents: ");
         for (int y : v)
             System.out.print( y + " ");
         System.out.println();
     }

     public static void main(String[] args) {
         //Notice how vaTest() can be called with a
         // variable number of arguments.
         vaTest1(10); //1 args
         vaTest1(1, 2, 3); //3 args
         vaTest1(); //no args
     }
}
