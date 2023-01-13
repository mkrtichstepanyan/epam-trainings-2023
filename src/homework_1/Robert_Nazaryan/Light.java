package homework_1.Robert_Nazaryan;

public class Light {

    public static void main(String[] args) {

        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186_000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = seconds * lightspeed;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.print(distance + " miles ");
    }
}
