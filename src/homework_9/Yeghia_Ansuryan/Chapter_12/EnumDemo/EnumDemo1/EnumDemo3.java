package homework_9.Yeghia_Ansuryan.Chapter_12.EnumDemo.EnumDemo1;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;
        System.out.println("Winesap costs " +
                Apple1.Winesap.getPrice() +
                " cents.\n");
        System.out.println("All apple prices:");
        for (Apple1 a : Apple1.values())
            System.out.println(a + " costs " + a.getPrice()
                    + " cents.");
    }
}
