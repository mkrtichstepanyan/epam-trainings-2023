package homework_4.Aram_Mehrabyan.chapter7;

public class VarArgs {
    static  void vtest(int ...v){
        System.out.print("Number of args: "+v.length+" Contents");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        vtest(10);
        vtest(1,2,3);
        vtest();
    }
}
