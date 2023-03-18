package homework_9.TatevKocharyan.chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("Here are all apple constants"
                + " and their ordinal values: ");

        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.GoldenDel;
        ap2 = Apple.RedDel;
        ap3 = Apple.RedDel;
        System.out.println();

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " comes before " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap + " comes before " + ap2);
        }

        if (ap.compareTo(ap2) == 0) {
            System.out.println(ap + " comes before" + ap2);
        }
        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println(" Error!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " equals " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}