package homework_8.Zara_Avetyan.NestedInterface;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
