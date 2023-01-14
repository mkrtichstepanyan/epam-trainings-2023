package homework_1.Nelli_Poghosyan;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        //speed of light
        lightSpeed = 186000;
        days = 1000; // number of days
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightSpeed * seconds; //compute distance

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles. ");
    }
}
