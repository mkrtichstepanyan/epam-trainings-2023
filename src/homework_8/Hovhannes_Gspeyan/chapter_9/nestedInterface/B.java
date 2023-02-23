package homework_8.Hovhannes_Gspeyan.chapter_9.nestedInterface;

public class B implements A.NestedIf{
    @Override
    public boolean isNegative(int x) {
        return x < 0 ? false: true;
    }
}
