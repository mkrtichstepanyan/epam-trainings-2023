package homework_8.Alina_Mkhoyan.chapter_9;

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}