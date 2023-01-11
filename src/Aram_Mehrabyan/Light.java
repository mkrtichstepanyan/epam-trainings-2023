package Aram_Mehrabyan;

public class Light {
    public static  void main(String []args){
        int lightspeed;
        long days;
        long second;
        long distance;
        lightspeed=186000;
        days=1000;
        second=days*24*60*60;
        distance=lightspeed*second;
        System.out.print("In "+days);
        System.out.print(" days light will travel about ");
        System.out.println(distance+" miles.");
    }
}
