package homework_4.Aram_Mehrabyan.chapter7;

public class VarArgs4 {
    static  void vtest(int ...v){
        System.out.print("vtest(int ...): "+" Number of args: "+v.length+" Contents");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }
    static  void vtest(boolean ...v){
        System.out.print("vtest(boolean ...): "+" Number of args: "+v.length+" Contents");
        for(boolean x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        vtest(1,2,3);
        vtest(true,false,false);
       // vtest();
    }
}
