package homework_3.Galust_Arzumanyan;


//This method is used to demonstrate if-else-if statements
class IfElse {
    public static void main(String[] args) {
        int month = 9; // September
        String season;

        if (month == 12 || month == 1 | month == 2)
            season = " Winter ";
        else if (month == 3 || month == 4 | month == 5)
            season = " Spring ";
        else if (month == 6 || month == 7 | month == 8)
            season = " Summer ";
        else if (month == 9 || month == 10 | month == 11)
            season = " Autumn ";
        else
            season = " Bogus Month ";
        System.out.printf("September is in the" + season + " . ");
    }
}
