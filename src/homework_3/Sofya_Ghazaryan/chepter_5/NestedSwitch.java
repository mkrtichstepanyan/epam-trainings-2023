package homework_3.Sofya_Ghazaryan.chepter_5;

public class NestedSwitch {
    public static void main(String[] args) {
        int count = 1;
        int target = 3;

        switch (count){
            case 1:
                switch (target){
                    case 0:
                        System.out.println("Target is zero");
                break;
                    case 1:
                        System.out.println("Target is one");
                        break;
                    default:
                        System.out.println("Target does not exist");
                }
                break;
            case 2:
                System.out.println("Count is 2");
                break;
            default:
                System.out.println("Count or Target aren't exist");
        }

    }
}
