package homework_9.garik_gharibyan.chapter_12;

enum Apply4 {
    JonaThen, GoldenDel, RedDEl, Winesap, CordLand;

}

public class EnumDemo4 {
    public static void main(String[] args) {
        Apply4 ap;
        Apply4 ap2;
        Apply4 ap3;

        System.out.println("Here are all constants and their ordinal value");

        for (Apply4 a : Apply4.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apply4.RedDEl;
        ap2 = Apply4.GoldenDel;
        ap3 = Apply4.RedDEl;

        System.out.println();
        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " come before " + ap2);
        }
        if (ap.compareTo(ap2) > 0){
            System.out.println(ap2 + " come before " + ap);
        }
        if (ap.compareTo(ap3) == 0){
            System.out.println(ap + " equals " + ap3);
        }
        System.out.println();

        if (ap.equals(ap2)){
            System.out.println("error");
        }
        if (ap.equals(ap3)){
            System.out.println(ap + " equals " + ap3);
        }
        if (ap == ap3){
            System.out.println(ap + " == " + ap3);
        }

    }
}
