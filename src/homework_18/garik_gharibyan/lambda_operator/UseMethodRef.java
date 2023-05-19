package homework_18.garik_gharibyan.lambda_operator;

import java.util.ArrayList;
import java.util.Collections;

class MyClass{
    int val;

    MyClass(int val){
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
public class UseMethodRef {
    static int compareMC(MyClass a,MyClass b){
        return a.getVal() - b.getVal();
    }
    public static void main(String[] args) {

        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        MyClass max = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Maximum value is: " + max.getVal());
    }
}
