package homework_9.Roza_Petrosyan.chapter_12.Enum2;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        for (Apple a: Apple.values()) {
            System.out.println(a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        if(ap.compareTo(ap2) > 0){
            System.out.println("After ap");
        }

        if(ap == ap3){
            System.out.println("After equal");
        }
    }
}
