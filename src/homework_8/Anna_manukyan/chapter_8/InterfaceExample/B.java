package homework_8.Anna_manukyan.chapter_8.InterfaceExample;

public class B implements A.NestedIf {
    @Override
    public boolean isNonNegative(int x) {
        return x < 0 ? false : true;
    }
}
