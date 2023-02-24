package homework_8.Ofelya_Khachatryan.chapter_9.interfaces;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
