package homework_14.TatevKocharyan.chapter14;

public class OverrideDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        Gen2<Integer> iob2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Generics Test");
        System.out.println(iob.getOb());
        System.out.println(iob2.getOb());
        System.out.println(strOb2.getOb());
    }
}