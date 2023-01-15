package Galust_Arzumanyan;

/*
This method is used to demonstrate the y variable life time
and shows loop count
*/
class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y;
            y = x;
            System.out.println("y is  " + y);
            y = 100;
            System.out.println("y is " + y);
        }
    }
}