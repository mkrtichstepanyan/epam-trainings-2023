package homework_5.gevorg_arghushyan.chapter_7;

public class PassArray {
    static void vaTest(int [] v){
        System.out.print("Quantity of arguments: " + v.length + " Content: ");
        for (int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        int [] n1 = {10};
        int [] n2 = {1, 2, 3};
        int [] n3 = { };

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}

