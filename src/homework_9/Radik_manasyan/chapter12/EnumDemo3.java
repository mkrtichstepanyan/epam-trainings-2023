package homework_9.Radik_manasyan.chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap;

        System.out.println("Яблоко сорто Winesap стоит " + Apple2.WINESAP.getPrice() + " центов. \n");
        System.out.println("Цeны на все сорта яблок:");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
        }
    }
}
