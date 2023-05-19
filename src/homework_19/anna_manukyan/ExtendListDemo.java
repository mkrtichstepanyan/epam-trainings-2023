package homework_19.anna_manukyan;

public class ExtendListDemo {
    public static void main(String[] args) {
        ExtendedList<Integer> intList = new ExtendedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(-30);
        intList.add(40);
        intList.add(73);
        intList.add(61);
        
        System.out.println("**** Extend list****");
        intList.forEach(System.out::println);

        System.out.println("***Mapped list***");
        ExtendedList<Integer> mappedList = intList.map((element) -> 2 * element);
        mappedList.forEach(System.out::println);

        System.out.println("***Generated elements***");
        intList.fill(() -> 70, 2);
        intList.forEach(System.out::println);

        System.out.println("***Elements  checking");
        System.out.println(intList.forAll((n) -> n > 0));

        System.out.println("***Elements Partitioning***");
        System.out.println(intList.partition((n) -> n % 2 == 0));

        System.out.println("***Reduce element***");
        Integer reduce = intList.reduce(Integer::sum, 0);
        System.out.println(reduce);

    }
}
