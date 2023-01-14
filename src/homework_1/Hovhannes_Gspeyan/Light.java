package homework_1.Hovhannes_Gspeyan;

/**
 * This class computes how much distance will
 * light cross in seconds using long variables
 */
public class Light {
    public static void main(String[] args) {

        int lightspeed;

        long days;

        long seconds;

        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.print(distance + " miles ");
    }
}
