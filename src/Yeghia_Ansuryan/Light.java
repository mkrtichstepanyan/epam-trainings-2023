package Yeghia_Ansuryan;
class Light {
    public static void main(String[] args) {
        int lidhtSpeed;
        long days;
        long seconds;
        long distance;
        lidhtSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lidhtSpeed * seconds;
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}
