package homework_8.Roza_Petrosyan.Chapter_9.NestedInterface;

public class B implements A.NestedIf {
    @Override
    public boolean isNonNegative(int x) {
        return x < 0 ? false : true;
    }
}
