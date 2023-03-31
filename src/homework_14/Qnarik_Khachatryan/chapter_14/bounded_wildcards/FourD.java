package homework_14.Qnarik_Khachatryan.chapter_14.bounded_wildcards;

//Four-dimensional coordinates

class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}
