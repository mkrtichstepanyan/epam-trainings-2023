//calculate the distance of the light
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        //approximate speed of the light (sec/mile)
        lightspeed = 186000;
        days = 1000;    //count of days
        seconds = days * 24 * 60 * 60;     //convert days to seconds
        distance = lightspeed * seconds;   //calculate the distance

        //print the approximate distance (in miles)
        // of the light in current days
        System.out.print("in " + days);
        System.out.print(" days the light will pass approximately ");
        System.out.println(distance + " miles");
    }
}
