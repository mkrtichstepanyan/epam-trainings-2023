package homework_1.Alina_Vardanovna;

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
        System.out.print(days + " օրում լույսը կանցնի մոտ " + distance + " միլ");
    }

}
