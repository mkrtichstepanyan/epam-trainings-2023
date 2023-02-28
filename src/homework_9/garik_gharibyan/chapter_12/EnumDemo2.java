package homework_9.garik_gharibyan.chapter_12;

enum Apple2 {
    JonaThen, GoldenDel, RedDEl, Winesap, CordLand;

}

public class EnumDemo2 {

    public static void main(String[] args) {
        Apple2 ap;
        System.out.println("Here are all Apple constants:");

        Apple2[] apples = Apple2.values();
        for (Apple2 a : apples) {
            System.out.println(a);
        }

        System.out.println();

        ap = Apple2.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
