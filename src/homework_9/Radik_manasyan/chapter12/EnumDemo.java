package homework_9.Radik_manasyan.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RED_DEL;
        System.out.println("Знaчeниe ар: " + ap);
        System.out.println();

        ap = Apple.GOLDEN_DEL;
        if (ap == Apple.GOLDEN_DEL) {
            System.out.println("Переменная ар содержит GOLDEN_DEL.\n");
        }
        switch (ap) {
            case JONATHAN:
                System.out.println("Copт JONATHAN красный.");
                break;
            case GOLDEN_DEL:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case RED_DEL:
                System.out.println("Сорт Red Delicious красный.");
                break;
            case WINESAP:
                System.out.println("Сорт WINESAP красный.");
                break;
            case CORTLAND:
                System.out.println("Сорт CORTLAND красный.");
                break;
        }
    }
}
