package homework_1.Alina_Vardanovna;

public class Conversion {

    public static void main(String[] args) {
        byte b;
        int i;
        i = 257;
        double d;
        d = 323.142;

        System.out.println("int-ը վերածում ենք byte-ի");
        b = (byte) i;
        System.out.println("i-ն կլինի " + i + ", b-ն՝ " + b);

        System.out.println("double-ը դարձնում ենք int");
        i = (int) d;
        System.out.println("d-ն կլինի " + d + ", i-ն՝ " + i);

        System.out.println("double-ը դարձնում ենք byte");
        b = (byte) d;
        System.out.println("d-ն կլինի " + d + ", b-ն՝ " + b);

    }

}
