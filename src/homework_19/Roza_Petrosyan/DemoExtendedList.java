package homework_19.Roza_Petrosyan;

public class DemoExtendedList {
    public static void main(String[] args) {
        ExtendedList<String> extendedList = new ExtendedList<>();
        extendedList.add("one");
        extendedList.add("two");
        extendedList.add("three");
        extendedList.add("four");

        ExtendedList<String> map = extendedList.map(String::toUpperCase);
        System.out.println(map);

        extendedList.fill(() -> "five", 3);
        System.out.println(extendedList);
        System.out.println(extendedList.forAll((n) -> n.startsWith("t")));
        System.out.println(extendedList.partition((n) -> n.endsWith("e")));
        System.out.println(extendedList.reduce((a, b) -> a + " - " + b, ""));

    }
}
