package homework_3.Arsen_Kazaryan.chapter_5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i equals zero.");
                    break;
                case 1:
                    System.out.println("i equals one.");
                    break;
                case 2:
                    System.out.println("i equals two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i more than three");
            }
    }
}
