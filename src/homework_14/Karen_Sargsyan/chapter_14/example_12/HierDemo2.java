package homework_14.Karen_Sargsyan.chapter_14.example_12;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen<String> w = new Gen<String>("Hello", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }

}
