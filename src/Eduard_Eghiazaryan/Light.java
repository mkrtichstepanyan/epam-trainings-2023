package Eduard_Eghiazaryan;

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

        System.out.print("for" + days);
        System.out.printf("days the light will pass about");
        System.out.printf(distance + "miles");
    }
}
