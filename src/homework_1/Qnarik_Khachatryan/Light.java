package homework_1.Qnarik_Khachatryan;

// Compute distance light travels using long variables.
class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate speed of light in miles per second
        lightspeed = 18600;
        days = 1000; //specify number of days here
        seconds = days * 24 * 60 * 60; //convert to seconds
        distance = lightspeed * seconds; // compute distance

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}
