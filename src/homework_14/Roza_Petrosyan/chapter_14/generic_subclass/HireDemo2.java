package homework_14.Roza_Petrosyan.chapter_14.generic_subclass;

public class HireDemo2 {
    public static void main(String[] args) {
        Gen<String> w = new Gen<>("Hello", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
