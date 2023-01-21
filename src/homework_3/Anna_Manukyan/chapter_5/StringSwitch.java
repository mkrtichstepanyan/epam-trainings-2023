package homework_3.Anna_Manukyan.chapter_5;

//Demonstrate switch-case statement
public class StringSwitch {
    public static void main(String[] args) {
        String str = "one";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}
