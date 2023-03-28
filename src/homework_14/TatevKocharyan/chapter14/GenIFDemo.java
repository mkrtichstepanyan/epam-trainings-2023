package homework_14.TatevKocharyan.chapter14;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);
        System.out.println("Max value in inums" + iob.max());
        System.out.println("Min value in inums" + iob.min());
        System.out.println("Max value in chs" + cob.max());
        System.out.println("Min value in chs" + cob.min());
    }


}
