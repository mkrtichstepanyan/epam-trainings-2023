package homework_18.yeghia_ansuryan.chapter_15.hight_temp;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v))
                count++;
        return count;
    }

    public static void main(String[] args) {

        int count;
        HightTemp[] weekDayHighs = {
                new HightTemp(89), new HightTemp(82),
                new HightTemp(90), new HightTemp(89),
                new HightTemp(89), new HightTemp(91),
                new HightTemp(84), new HightTemp(83)
        };
        count = counter(weekDayHighs, HightTemp::sameTemp, new HightTemp(89));

        System.out.println(count + " days had a high of 89");
        HightTemp[] weekDayHighs2 = {
                new HightTemp(32), new HightTemp(12),
                new HightTemp(24), new HightTemp(19),
                new HightTemp(18), new HightTemp(12),
                new HightTemp(-1), new HightTemp(13)
        };

        count = counter(weekDayHighs2, HightTemp::sameTemp, new HightTemp(12));
        System.out.println(count + " days had a high of 12");

        count = counter(weekDayHighs, HightTemp::lessThanTemp, new HightTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDayHighs2, HightTemp::lessThanTemp, new HightTemp(19));
        System.out.println(count + " days had a high of less than 19");
    }
}
