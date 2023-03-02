package homework_8.gevorg_arghushyan_chapter_9;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
