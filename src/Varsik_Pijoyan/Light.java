package Varsik_Pijoyan;
public class Light {
    public static void main( String[] args ){
        int Lightspeed;
        long days;
        long seconds;
        long distance;
        Lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = Lightspeed * seconds;
        System.out.print("In" + days);
        System.out.print("days light will travel about");
        System.out.println(distance + "miles");
    }
}
