package homework_8.Varsik_Pijoyan.chapter_8.PackagesAndInheritances.IntStack;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystac1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) {
            mystac1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack in  mystack1:");
        for (int i = 0; i < 12; i++) {
            mystac1.pop();
        }

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 20; i++) {
            mystack2.pop();
        }
    }
}
