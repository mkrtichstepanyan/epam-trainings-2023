package homework_8.Diana_Melkonyan.nestedInterface;

public class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x< 0 ? false: true;
    }
}
