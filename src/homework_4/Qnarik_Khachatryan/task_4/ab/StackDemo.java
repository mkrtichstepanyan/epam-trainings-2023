package homework_4.Qnarik_Khachatryan.task_4.ab;

class StackDemo {
    public static void main(String[] args) {
        Stack mystack = new Stack(5);

        mystack.push(6);
        mystack.push(3);
        mystack.push(2);
        mystack.push(7);
        mystack.push(5);
        mystack.push(70);

        //        System.out.println(Arrays.toString(mystack.myStack));
        System.out.println(mystack.pop());
    }
}
