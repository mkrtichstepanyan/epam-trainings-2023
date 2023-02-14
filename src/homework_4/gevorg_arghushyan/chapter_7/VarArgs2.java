package homework_4.gevorg_arghushyan.chapter_7;

public class VarArgs2 {
    static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " Content: ");
        for (int x: v)
            System.out.print(x + "  ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One variable length argument: " , 10);
        vaTest("Tree variable length arguments: " , 1, 2, 3);
        vaTest("No variable length argument: " , 10);
    }
}
