package homework_1.andranik_Sargsyan;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles");
    }
}
