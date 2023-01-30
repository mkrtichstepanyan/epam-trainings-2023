package homework_5.chapter_7;

/**
 * This class demonstrates
 * difference between private
 * and public modifiers
 */
public class Test4 {
    int a;
    public int b;
    private int c;

    void setC(int i){
        a = i;
    }
    int getC(){
        return c;
    }
}
