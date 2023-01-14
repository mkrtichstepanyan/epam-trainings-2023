package homework_1.Levon_Harutyunyan.homework_1;

public class Light {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about " + days);
        System.out.println(distance + " miles.");
    }
}
