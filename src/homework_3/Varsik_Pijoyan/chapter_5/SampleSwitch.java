package homework_3.Varsik_Pijoyan.chapter_5;

//A simple example of the switch
public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is 0");
                    break;
                case 1:
                    System.out.println("i is 1");
                    break;
                case 2:
                    System.out.println("i is 2");
                    break;
                case 3:
                    System.out.println("i is 3");
                    break;
                default:
                    System.out.println("i is greater than 3");
            }
        }
    }
}
