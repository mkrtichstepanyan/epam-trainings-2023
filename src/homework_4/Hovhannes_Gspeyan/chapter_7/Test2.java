package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * This class demonstrates how can
 * we pass objects to methods
 */
public class Test2 {
    int a;
    int b;

    Test2(int i, int j){
       a = i;
       b = j;
    }
   void meth(Test2 o){
        o.a *= 2;
        o.b /= 2;
   }
}
