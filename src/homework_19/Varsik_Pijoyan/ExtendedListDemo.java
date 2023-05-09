package homework_19.Varsik_Pijoyan;

public class ExtendedListDemo {
    public static void main(String[] args) {
        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(12);
        list.add(44);
        list.add(20);
        list.add(56);

        System.out.println("1. Extended list");
        list.forEach(x -> System.out.println(x));
        System.out.println("-------------------------------------");

        System.out.println("2. Mapped List");
        ExtendedList<Integer> mappedList = list.map((x) -> 2 * x);
        mappedList.forEach(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("3. Generated elements");
        list.fill(() -> 34, 1);
        list.forEach(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("4. Checking elements");
        System.out.println(list.forAll((x) -> x > 0));
        System.out.println("-------------------------------------");

        System.out.println("5. Elements Partitioning");
        System.out.println(list.partition((x) -> x % 2 == 0));
        System.out.println("-------------------------------------");

        System.out.println("6. Reducing elements");
        Integer reduce = list.reduce(Integer::sum, 0);
        System.out.println(reduce);
    }
}
