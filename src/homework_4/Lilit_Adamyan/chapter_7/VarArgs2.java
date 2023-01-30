package homework_4.Lilit_Adamyan.chapter_7;

public class VarArgs2 {
    static void vaTest(String msg,int...v){
        System.out.print(msg + v.length + " Contents");

        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one vararg: " ,10);
        vaTest("two varargs: " ,1,2,3);
        vaTest("three varargs: " );
    }
}
