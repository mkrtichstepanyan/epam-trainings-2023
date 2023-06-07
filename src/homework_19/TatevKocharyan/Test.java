package homework_19.TatevKocharyan;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        ExtendedList<String> strings = new ExtendedList<>();
        strings.add("AAAa");
        strings.add("BBB");
        strings.add("CCCa");
        strings.add("DDD");
        ExtendedList<Integer> integers = new ExtendedList<>();
        integers.add(7);
        integers.add(18);
        integers.add(10);
        integers.add(24);
        integers.add(17);
        integers.add(5);
        // method fill()
        strings.fill(() -> "ggg", 2);
        strings.fill(() -> "aaa", 2);
        strings.fill(() -> "fa", 2);

        // method partition
        List<ExtendedList<String>> a = strings.partition(s1 -> s1.endsWith("a"));
        System.out.println(a);
        // method reduce
        int sum = integers.reduce(Integer::sum,1);
        System.out.println(sum);

    }
}
