package homework_14.Qnarik_Khachatryan.chapter_14;

//Use a generic constructor
class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}
