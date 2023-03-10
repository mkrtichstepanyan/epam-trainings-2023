package homework_9.Yeghia_Ansuryan.Chapter_12.EnumDemo.EnumDemo2_2;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple2_2 ap, ap2, ap3;

        System.out.println("Here are all apple constants" +
                " and their ordinal values: ");
        for (Apple2_2 a : Apple2_2.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple2_2.RedDel;
        ap2 = Apple2_2.GoldenDel;
        ap3 = Apple2_2.RedDel;

        System.out.println();
        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " comes before " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " comes before " + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " equals " + ap3);
        }
        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println("Error!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " equals " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
