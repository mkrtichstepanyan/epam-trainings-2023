package homework_8.shushanik_araqelyan_chapter9;

public class DynStack {
    private int[] stck;
    private int tos;
    DynStack(int size){
        stck = new int[size];
        tos = -1;
    }
    public void push(int item){
        if(tos==stck.length-1){
            int[]temp = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i]=stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        stck[++tos]=item;
    }
    public int pop(){
        if(tos<0){
            System.out.println("Stack underflow.");
            return 0;
        }
        return stck[tos--];
    }
}
