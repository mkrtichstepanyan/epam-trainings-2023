package homework_1.Anush_Ananyan;

public class Light {
    public static void main(String[] args) {
        int ligthspeed;
        long days;
        long seconds;
        long distance;
        ligthspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = ligthspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles. ");
    }
}
