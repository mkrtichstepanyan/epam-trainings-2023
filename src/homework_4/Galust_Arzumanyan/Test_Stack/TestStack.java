package homework_4.Galust_Arzumanyan.Test_Stack;


class TestStack {
    public static void main(String[] args) {
        int size = 8;
        Stack mystack1 = new Stack(size);
        for (int i = 0; i <= size - 1; i++) {
            mystack1.push(i);
        }

        System.out.println("Stack in mystack1: ");
        for (int i = 0; i <= size - 1; i++) {
            System.out.println(mystack1.pop());
        }

    }
}