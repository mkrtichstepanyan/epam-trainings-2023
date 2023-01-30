package homework_4.Nona_Asatryan.chapter_7;

class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int getI() {
        return i;
    }

    void setI(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}


