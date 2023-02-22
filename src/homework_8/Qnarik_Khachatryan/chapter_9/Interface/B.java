package homework_8.Qnarik_Khachatryan.chapter_9.Interface;

// B implements the nested interface.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
