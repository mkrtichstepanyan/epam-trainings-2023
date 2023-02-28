package homework_8.aram_mehrabyan.interfaces.nestedinterfaces;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
