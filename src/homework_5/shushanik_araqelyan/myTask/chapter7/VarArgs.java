package homework_5.shushanik_araqelyan.myTask.chapter7;

public class VarArgs {
    static void vaTest(int...v){
        System.out.println("Number of args:" + v.length + "Contetnts");
        for(int x:v)
        System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        {
            vaTest(10);
            vaTest(1,2,3);
            vaTest();
        }
    }
}
