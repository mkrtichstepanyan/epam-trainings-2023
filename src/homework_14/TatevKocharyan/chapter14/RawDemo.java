package homework_14.TatevKocharyan.chapter14;

public class RawDemo {
    public static void main(String[] args) {
        Gen1<Integer> iOb=new Gen1<>(88);
        Gen1<String> strOb=new Gen1<>("Generics Test");
        Gen1 raw=new Gen1(Double.valueOf(98.6));
        double d=(Double) raw.getOb();
        System.out.println("value:"+d);

    }
}
