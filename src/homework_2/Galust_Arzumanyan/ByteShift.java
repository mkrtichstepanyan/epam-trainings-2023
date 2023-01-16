package homework_2.Galust_Arzumanyan;

// This method is used to demonstrate left shifting a byte value
class ByteShift {
    public static void main(String[] args) {
        byte a = 77, b; // a in binary is 0100_1101
        int i;
        i = a << 4; // i in binary is 0100_1101_0000
        b = (byte) (a << 4); // b is -48: b in binary is 0011_0000
        System.out.println("Original value of a is " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
