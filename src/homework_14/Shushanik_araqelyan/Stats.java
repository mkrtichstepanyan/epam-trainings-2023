package homework_14.Shushanik_araqelyan;

public class Stats <T>{
    T[] nums;
    Stats(T[] o){
        nums = o;
    }
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();//Error!
            return sum / nums.length;
        }
    }


