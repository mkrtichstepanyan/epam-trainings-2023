package homework_8.Samvel_Hakobyan.nestedinterface;

public class B implements A.NestedF {

    @Override
    public boolean inNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
