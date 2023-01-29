package homework_4.Varsik_Pijoyan.chapter_7;

public class MyClass {
    private int i;

    MyClass(int k){
        i=k;
    }
    int getI(){
        return i;
    }
    void setI(int k){
        if (k >= 0){
            i = k;
        }
    }
}

