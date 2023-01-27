package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate simple example of the switch
class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println(" i is zero. ");
                    break;
                case 1:
                    System.out.println(" i is one. ");
                    break;
                case 2:
                    System.out.println(" i is two. ");
                    break;
                case 3:
                    System.out.println(" i is three. ");
                    break;
                default:
                    System.out.println(" i is greater than 3.");
            }
    }
}
