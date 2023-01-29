package homework_4.Vahe_Vardanyan.homework_4_1.stack2;

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 stack2 = new Stack2(new int[]{20});
        for (int i = 20; i >= 0; i--) {
            stack2.push(i);
        }
        for (int i = 0; i < 20; i++) {

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Pop element : " + stack2.pop());
        }
    }
}
