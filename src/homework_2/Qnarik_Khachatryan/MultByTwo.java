package homework_2.Qnarik_Khachatryan;

// Left shifting as a quick way to multiply by 2.
class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE; //268435454 //1111 1111 1111 1111 1111 1111 1110

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);

        }
    }
}
//536870908
//1073741816
//2147483632
//-32     когда единичный бит сдвигается в позицию 31, число интерпретируется как отрицательное.
