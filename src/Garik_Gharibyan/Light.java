package Garik_Gharibyan;

public class Light {
    public static void main(String[] args) {
        int lightSpeed = 186000;
        long days;
        long seconds;
        long distance;

        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;

        System.out.print("In " + days);
        System.out.println(" days light will travel about " + distance + " miles.");
    }
}
