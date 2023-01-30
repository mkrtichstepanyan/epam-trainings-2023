package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумент переменной длины: ", 10);
        vaTest("Три аргумент переменной длины: ", 1, 2, 3);
        vaTest("Без аргумент переменной длины: ");
    }
}
