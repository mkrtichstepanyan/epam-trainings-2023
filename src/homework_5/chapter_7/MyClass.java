package homework_5.chapter_7;

/**
 * this class demonstrates
 * local variable type inference
 * with a user - defined class type
 */
public class MyClass {
    private int i;

    MyClass(int k){
        i = k;
    }
    int getI(){
        return i;
    }
    void setI(int k){
        if(k >= 0){
            i = k;
        }
    }
}
