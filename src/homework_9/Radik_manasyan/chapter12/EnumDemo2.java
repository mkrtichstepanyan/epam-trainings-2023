package homework_9.Radik_manasyan.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple:");

        Apple[] allApples = Apple.values();
        for (Apple allApple : allApples) {
            System.out.println(allApple);
        }
        System.out.println();
        ap = Apple.valueOf("WINESAP");
        System.out.println("Пepeмeннaя ар содержит " + ap);
    }
}
