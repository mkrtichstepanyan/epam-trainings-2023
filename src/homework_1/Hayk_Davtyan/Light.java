package homework_1.Hayk_Davtyan;

public class Light {
    public static void main(String [] args){
        int lightspeed;
        int days;
        long second;
        long distance;
        lightspeed = 186000;
        days = 1000;
        second = days * 24 * 60 * 60;
        distance = lightspeed * second;
        System.out.println("in " + days);
        System.out.println("days light will travel about ");
        System.out.println(distance + " miles.");
    }
}
