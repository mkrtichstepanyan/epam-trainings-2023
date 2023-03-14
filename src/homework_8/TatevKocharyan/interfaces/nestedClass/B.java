package homework_8.TatevKocharyan.interfaces.nestedClass;

public class B implements A.NestedF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}