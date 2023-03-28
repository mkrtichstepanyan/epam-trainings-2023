package homework_14.Anush_Ananyan.Chapter_14;

public class HierDemo {
    public static void main(String[] args) {
        Gen1<String, Integer> x = new Gen1<String, Integer>("Value is: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());

    }
}
