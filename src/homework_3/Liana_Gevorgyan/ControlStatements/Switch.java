package homework_3.Liana_Gevorgyan.ControlStatements;
//An improved version of the season program
public class Switch {
    public static  void main(String args[]){
        int month=4;
        String seasons;
        switch (month){
            case 12:
            case 1:
            case 2:
                seasons ="Winter";

            case 3:
            case 4:
            case 5:
                seasons="Spring";
                break;
            case 6:
            case 7:
            case 8:
                seasons="Summer";
                break;
            case 9:
            case 10:
            case 11:
                seasons="Autumn";
                break;
            default:
                seasons= "Bogus Month";

        }
        System.out.println("April is in the " + seasons + ". ");
    }
}
