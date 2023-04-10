package homework_14.Nona_Asatryan.chapter_14;

public class GenericDemo {
    public static void main(String[] args) {
        Generic2<String, Integer> x = new Generic2<String, Integer>("Value: ", 99);
        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
