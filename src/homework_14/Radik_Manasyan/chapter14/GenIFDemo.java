package homework_14.Radik_Manasyan.chapter14;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] iNums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iOb = new MyClass<>(iNums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Максимальное значение в массиве iNums: " + iOb.max());
        System.out.println("Минимальное значение в массиве iNums: " + iOb.min());
        System.out.println("Максимальное значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значение в массиве chs: " + cob.min());
    }
}
