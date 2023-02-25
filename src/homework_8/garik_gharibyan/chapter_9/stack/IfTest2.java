package homework_8.garik_gharibyan.chapter_9.stack;

public class IfTest2 {

    public static void main(String[] args) {
        DinStack myStack1 = new DinStack(5);
        DinStack myStack2 = new DinStack(8);

        for (int i = 0; i < 12; i++) myStack1.pus(i);
        for (int i = 0; i < 20; i++) myStack2.pus(i);

        System.out.println("Stack in myStack1");
        for (int i = 0; i < 12; i++) System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2");
        for (int i = 0; i < 20; i++) System.out.println(myStack2.pop());


        DinStack myStack3 = new DinStack(10);
        for (int i = 0; i < 10; i++) myStack3.pus(i);

        System.out.print("pop top 3 element: ");
        int[] nElements = myStack3.popNElements(3);
        for (int i = 0; i < nElements.length; i++) {
            System.out.print(nElements[i] + " ");
        }

        System.out.print("\nskip 'p1' element and pop top 'p2' element: ");
        int[] skipAndNElements = myStack3.skipAndPopNElements(2,3);
        for (int i = 0; i < skipAndNElements.length; i++) {
            System.out.print(skipAndNElements[i] + " ");
        }

    }
}
