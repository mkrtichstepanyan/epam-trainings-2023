package homework_8.Yeghia_Ansuryan.Chapter_9.Callback.NestedIfDemo;

import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.NestedIfDemo.A;

public class B implements A.NestedF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
