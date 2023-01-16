package homework_2.Qnarik_Khachatryan;

//Left shifting a byte value
class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;  // 0100 0000
        int i;

        i = a << 2;      //01 0000 0000 added 00
        b = (byte) (a << 2);

        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);

    }
}
