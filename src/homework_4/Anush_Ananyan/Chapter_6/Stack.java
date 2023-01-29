package homework_4.Anush_Ananyan.Chapter_6;

public class Stack {
   private int[] stck;
   private int tos;

    public Stack() {
        stck = new int[10];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length * 75 / 100) {
            extendVolume();
        }
        stck[++tos] =item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    private void extendVolume() {
        int[] newStck = new int[stck.length * 2];
        for (int i = 0; i <= tos; i++) {
            newStck[i] = stck[i];
        }
         stck =newStck;
    }
}
