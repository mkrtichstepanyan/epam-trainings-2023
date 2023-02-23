package homework_8.rafik_pahlevanyan.chapter_9;

//B implements the nested interface
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}