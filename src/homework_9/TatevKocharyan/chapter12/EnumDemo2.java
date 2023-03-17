package homework_9.TatevKocharyan.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all apple constants");
        Apple allapples[]=Apple.values();
        for (Apple a:allapples){
            System.out.println(a);
        }
        System.out.println();
        ap=Apple.valueOf("Winesap");
        System.out.println("ap contains "+ ap);
    }
}
