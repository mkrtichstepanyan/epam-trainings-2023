package homework_7.Lilit_Adamyan.chapter_9.callBack;

public class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
