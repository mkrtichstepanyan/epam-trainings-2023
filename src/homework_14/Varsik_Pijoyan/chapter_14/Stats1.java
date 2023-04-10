package homework_14.Varsik_Pijoyan.chapter_14;

//Use a wildcard
public class Stats1<T extends Number> {
    T[] nums; //array of Number or subclass

    //Pass the constructor a reference to
    //an array of type Number or subclass
    Stats1(T[] o) {
        nums = o;
    }

    //Return type double in all cases
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    //Determine if two averages are the same
    boolean isSameAvg(Stats1<?> ob) {
        if (average() == ob.average())
            return true;

        return false;
    }

}
