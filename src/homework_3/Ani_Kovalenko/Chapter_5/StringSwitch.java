package homework_3.Ani_Kovalenko.Chapter_5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "Two";
        switch (str) {
            case "One":
                System.out.println("One");
                break;
            case "Two":
                System.out.println("Two");
                break;
            case "Three":
                System.out.println("Three");
                break;
            case "Four":
                System.out.println("Four");
                break;
            default:
                System.out.println("Matches are not exist");
                break;
        }
    }
}
