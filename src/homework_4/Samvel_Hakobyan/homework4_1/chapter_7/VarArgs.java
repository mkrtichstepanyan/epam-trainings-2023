package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class VarArgs {
    static  void vaTest(int... v){
        System.out.print("Numbers of args: " + v.length +
                "Contents");
        for (int x:v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
