package homework_14.Radik_Manasyan.chapter14;

public class HierDemo {
    public static void main(String[] args) {
        Gen3<String, Integer> x =
                new Gen3<>("Значение равно: ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
