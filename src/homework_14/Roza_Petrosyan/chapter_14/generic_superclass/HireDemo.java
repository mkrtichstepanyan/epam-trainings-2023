package homework_14.Roza_Petrosyan.chapter_14.generic_superclass;

public class HireDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<>("Value is: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
