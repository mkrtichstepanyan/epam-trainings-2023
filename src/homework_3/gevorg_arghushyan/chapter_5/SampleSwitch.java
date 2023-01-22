package homework_3.gevorg_arghushyan.chapter_5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++){
            switch (i) {
                case 0:
                    System.out.println("i is equals zero.");
                    break;
                case 1:
                    System.out.println("i is equals one.");
                    break;
                case 2:
                    System.out.println("i is equals two.");
                    break;
                case 3:
                    System.out.println("i is equals three.");
                    break;
                default:
                    System.out.println("i is greater than three.");
            }
        }
    }
}
