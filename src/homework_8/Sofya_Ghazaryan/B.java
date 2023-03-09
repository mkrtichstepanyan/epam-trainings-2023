package homework_8.Sofya_Ghazaryan;

public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
