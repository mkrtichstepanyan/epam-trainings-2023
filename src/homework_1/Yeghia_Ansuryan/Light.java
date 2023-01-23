package homework_1.Yeghia_Ansuryan;

public class Light {
    public static void main(String[] args) {
     int lightSpeed;
     long days;
     long seconds;
     long distanse;
     lightSpeed = 186000;
     days = 1000;
     seconds = days * 24 * 60 * 60;
     distanse = lightSpeed * seconds;
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distanse + " miles.");
    }
}
