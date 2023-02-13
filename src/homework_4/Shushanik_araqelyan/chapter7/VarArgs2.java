package homework_4.Shushanik_araqelyan.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int ...v){
        System.out.println(msg + v.length + "Contents :");
        for(int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        {
            vaTest("One vararg: ",
                    10);
            vaTest("Three varargs:1,2,3");
            vaTest("No varargs :");
        }
    }
}
