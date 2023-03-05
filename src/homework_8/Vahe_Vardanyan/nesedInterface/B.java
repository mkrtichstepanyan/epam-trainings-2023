package homework_8.Vahe_Vardanyan.nesedInterface;

public class B implements A.NestedF {

    @Override
    public boolean inNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
