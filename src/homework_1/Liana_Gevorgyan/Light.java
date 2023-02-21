package homework_1.Liana_Gevorgyan;

public class Light {
    public static void main(String args []){
        int lightspeed ;
        long days;
        long seconds;
        long distance;
        lightspeed= 186000;
        days= 1000;// Specify number of days here
        seconds = days * 24*60*60;//convert to seconds
        distance=  lightspeed * seconds; // compute distance
        System.out.println(" In " + days);
        System.out.println(" Days light will travel about ");
        System.out.println(distance + " miles ");
    }
}
