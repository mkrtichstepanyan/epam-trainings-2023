package Galust_Arzumanyan;

//This method is used to demonstrate one-dimensional arrays
class Array {
    public static void main(String[] args) {
        int[] months_day;
        months_day = new int[12];
        months_day[0] = 31;
        months_day[1] = 28;
        months_day[2] = 31;
        months_day[3] = 30;
        months_day[4] = 31;
        months_day[5] = 30;
        months_day[6] = 31;
        months_day[7] = 31;
        months_day[8] = 30;
        months_day[9] = 31;
        months_day[10] = 30;
        months_day[11] = 31;
        System.out.println("March has " + months_day[2] + " days");

    }
}