package homework_1.gevorg_arghushyan;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186_000;
        days = 1_000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("Per " + days);
        System.out.print(" days the light will pass about " );
        System.out.print(distance + " miles.");
    }
}
