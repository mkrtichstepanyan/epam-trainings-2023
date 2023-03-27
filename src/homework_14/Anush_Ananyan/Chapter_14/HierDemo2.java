package homework_14.Anush_Ananyan.Chapter_14;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen2<String > w = new Gen2<String >( "Hello", 74);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getnum());
    }
}
