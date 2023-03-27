package homework_14.Ani_Kovalenko.chapter_14.example_9;

public class GenIfDemo {
    public static void main(String[] args) {

        Integer[] iNums = {3, 6, 2, 8, 6};
        Character[] chars = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iOb = new MyClass<>(iNums);
        MyClass<Character> cOb = new MyClass<>(chars);

        System.out.println("Max value in iNums: " + iOb.max());
        System.out.println("Min value in iNums: " + iOb.min());
        System.out.println("Max value in chars: " + cOb.max());
        System.out.println("Min value in chars: " + cOb.min());
    }
}
