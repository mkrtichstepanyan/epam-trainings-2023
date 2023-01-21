package homework_3.Lilit_Adamyan.chapter_5;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int x :numbers){
            System.out.println("Value is: " + x);
            sum += x;

        }
        System.out.println("Summation: " + sum);
    }
}
