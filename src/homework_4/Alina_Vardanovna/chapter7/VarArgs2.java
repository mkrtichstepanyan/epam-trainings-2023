package homework_4.Alina_Vardanovna.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " պարունակությունը՝ ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Մասիվն ունի 1 էլեմենտ: ", 10);
        vaTest("Մասիվն ունի 3 էլեմենտ: ", 1, 2, 3);
        vaTest("Մասիվն էլեմենտ չունի: ");
    }

}
