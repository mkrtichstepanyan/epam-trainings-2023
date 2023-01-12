package Ani_Kovalenko;

public class Integers {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186_000;
        days = 1000;
        seconds = days*24*60*60;
        distance = lightspeed*seconds;

        System.out.println ("The light passes for about " + distance + " miles during " + days + " days");

    }
}
