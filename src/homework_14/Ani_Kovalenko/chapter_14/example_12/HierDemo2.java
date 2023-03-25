package homework_14.Ani_Kovalenko.chapter_14.example_12;

public class HierDemo2 {
    public static void main(String[] args) {

        Gen<String> w = new Gen<>("Hello", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum() + " ");

    }
}
