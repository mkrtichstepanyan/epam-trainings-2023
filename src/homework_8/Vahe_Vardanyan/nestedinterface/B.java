package homework_8.Vahe_Vardanyan.nestedinterface;

public class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ?  false: true;
    }
}
