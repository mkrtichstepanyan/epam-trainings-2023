package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * This class demonstrates how can
 * we pass objects to methods
 */
public class Test {
    int a;
    int b;

    Test(int i, int j){
       a = i;
       b = j;
    }
    boolean equalTo(Test o){
        if(o.a == a && o.b == b){
            return true;
        }else{
            return false;
        }
    }
}
