package homework_3.Liana_Gevorgyan.ControlStatements;
//Demonstrate if-else-if statements
public class IfElse {
    public static void main(String args[]){
        String season;
        int month =4;//April Spring season
        if (month==12 || month ==1 || month ==2)
            season="Winter";
            else if (month == 3 || month == 4 || month == 5)
            season="Spring";
            else if(month==6|| month==7|| month==8)
            season="`summer";
            else if (month==9 || month==10|| month==11)
            season="Autumn";


else
   season="Bogus Month";
        System.out.println("April is the  " + season + " . ");
    }

}
