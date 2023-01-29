package homework_4.Aram_Mehrabyan.chapter7;

public class VarArgs2 {
    static  void vtest(String msg,int ...v){
        System.out.print(msg+v.length+" Contents");
        for(int x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        vtest("One vararg: ",10);
        vtest("Threes varargs ",1,2,3);
        vtest("No varargs ");
    }
}
