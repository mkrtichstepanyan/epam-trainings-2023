package Arsen_Kazaryan;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Абсолютная величина");
        System.out.println(i + "равна " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Абсолютная величина");
        System.out.println(i + "равна" + k);
    }
}
