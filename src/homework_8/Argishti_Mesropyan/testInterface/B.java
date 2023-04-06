package homework_8.Argishti_Mesropyan.testInterface;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
