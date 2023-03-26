package homework_14.Yeghia_Ansuryan.chapter_14.genericSubclass;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen<String> w = new Gen<String>("Hello", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
