package homework_14.gohar_hakobyan.chapter_14;

public class HiperDemo2 {
    public static void main(String[] args) {

        GenInt<String> w = new GenInt<>("Welcome", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
