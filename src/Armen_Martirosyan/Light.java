package Armen_Martirosyan;

public class Light {
    public static void main(String[] args) {


        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;

        System.out.println("In " + days + " days light will travel about " +distance + " miles.");
    }

}
