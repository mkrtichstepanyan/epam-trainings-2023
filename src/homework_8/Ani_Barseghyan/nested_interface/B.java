package homework_8.Ani_Barseghyan.nested_interface;

public class B implements A.NestedIf{
    @Override
    public boolean isNegative(int x) {
        return x < 0 ? false: true;
    }
}
