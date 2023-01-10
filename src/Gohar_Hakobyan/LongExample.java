package src.Gohar_Hakobyan;

//Compute distance light travels using long variables.
public class LongExample {
    public static void main(String[] args) {

        int lightSpeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightSpeed * seconds;

        //approximate speed of light in miles per second
        System.out.print("In " + days + "  days the light will travel about " + distance + " miles.");
    }
}
