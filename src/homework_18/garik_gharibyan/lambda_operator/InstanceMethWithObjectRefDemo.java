package homework_18.garik_gharibyan.lambda_operator;

interface MyFunc1<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp highTemp) {
        return hTemp == highTemp.hTemp;
    }

    boolean lessThenTemp(HighTemp highTemp) {
        return hTemp < highTemp.hTemp;
    }

}

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] values, MyFunc1 mf, T v) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (mf.func(values[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = { new HighTemp(89),new HighTemp(82),
                new HighTemp(90),new HighTemp(89),
                new HighTemp(89),new HighTemp(91),
                new HighTemp(84),new HighTemp(83)};

        MyFunc1<HighTemp> myFunc1 = HighTemp::sameTemp;
        MyFunc1<HighTemp> myFunc2 = HighTemp::lessThenTemp;

        count = counter(weekDayHighs,myFunc1,new HighTemp(89));
        System.out.println(count + " days had a high of 89");


        HighTemp[] weekDayHighs2 = { new HighTemp(32),new HighTemp(12),
                new HighTemp(24),new HighTemp(19),
                new HighTemp(18),new HighTemp(12),
                new HighTemp(-1),new HighTemp(13)};

        count = counter(weekDayHighs2,myFunc1,new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        count = counter(weekDayHighs,myFunc2,new HighTemp(89));
        System.out.println(count + " days had a high lass then 89");

        count = counter(weekDayHighs2,myFunc2,new HighTemp(19));
        System.out.println(count + " days had a high lass then 12");
    }
}
