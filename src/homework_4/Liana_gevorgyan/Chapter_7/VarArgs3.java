package homework_4.Liana_gevorgyan.Chapter_7;
// Varargs and overloading.
class VarArgs3 {
    static  void vaTest (int ...v){
        System.out.print("vaTest (int ....): " + "number of args: " + v.length + " Contents: ");
        for (int x : v)
            System.out.print(x +  " ");
        System.out.println();
    }
    static  void vaTest (boolean ...v){
        System.out.print("vaTest (int ....): " + "number of args: " + v.length + " Contents: ");
        for (boolean x : v)
            System.out.print(x +  " ");
        System.out.println();
    }
    static  void vaTest (String msg, int  ...v){
        System.out.print("vaTest (String, int ....): " + "number of args: " + msg + v.length + " Contents: ");
        for (int x : v)
            System.out.print(x +  " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("testing: ", 10, 20);
        vaTest(true, false, false);
    }
}
