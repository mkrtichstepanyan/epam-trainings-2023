package homework_8.Hovhannes_Gspeyan.nestedInterface;

import homework_8.Hovhannes_Gspeyan.nestedInterface.A;

public class B implements A.NestedIf{
    @Override
    public boolean isNegative(int x) {
        return x < 0 ? false: true;
    }
}
