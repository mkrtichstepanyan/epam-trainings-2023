package homework_3.Araksya_Ghazaryan.chapter_5;

public class SampaleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
        switch(i) {
            case 0:
                System.out.println("i is zero.");
                break;
            case 1:
                System.out.println("i is one.");
                break;
            case 2:
                System.out.println("i is two.");
                break;
            case 3:
                System.out.println("i is tree.");
                break;
            default:
                System.out.println("i is greater then 3.");
        }
    }
}
