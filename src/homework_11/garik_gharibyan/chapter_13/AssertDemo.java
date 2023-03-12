package homework_11.garik_gharibyan.chapter_13;

public class AssertDemo {
    static int val = 3;
    static int getInt(){
        return val--;
    }
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getInt();

            assert n > 0 : "n is not positive";

            System.out.println("n is " + n);
        }
    }
}
