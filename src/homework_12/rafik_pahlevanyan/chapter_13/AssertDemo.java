package homework_12.rafik_pahlevanyan.chapter_13;

public class AssertDemo {
    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();
            assert n > 0;
            System.out.println("n is  " + n);
        }
    }
}
