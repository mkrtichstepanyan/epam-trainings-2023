package homework_7.Anna_Manukyan.chapter_8.interfaceExample;

public class B implements A.NestedIf {
    @Override
    public boolean isNonNegative(int x) {
        return x < 0 ? false : true;
    }
}
