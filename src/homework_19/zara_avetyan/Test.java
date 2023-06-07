package homework_19.zara_avetyan;

public class Test {
    public static void main(String[] args) {
        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(41);
        list.add(74);
        list.add(10);
        list.add(2);
        list.add(145);

        System.out.println("-----list-----");
        System.out.println(list);

        System.out.println("\n------map-----");
        System.out.println(list.map((item) -> item / 2 * 7));

        System.out.println("\n-----fill-----");
        list.fill(() -> 27, 3);
        System.out.println(list);

        System.out.println("\n-----forAll-----");
        System.out.println(list.forAll((n) -> n > 0));

        System.out.println("\n-----partition-----");
        System.out.println(list.partition((n) -> n % 2 == 0));

        System.out.println("\n-----reduce-----");
        System.out.println(list.reduce(Integer::sum, 0));

    }
}
