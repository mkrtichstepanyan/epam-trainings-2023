package homework_2.Rafik_Pahlevanyan.chapter_4;

//Demonstrate the bitwise logical operators
public class BitLogic {
    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0100",
                "0101", "0111", "1000", "1001", "1010",
                "1100", "1011", "1101", "1110", "1111",
                "0110"
        };
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" а = " + binary[a]);
        System.out.println(" Ь = " + binary[b]);
        System.out.println(" a|b " + binary[c]);
        System.out.println(" а&Ь " + binary[d]);
        System.out.println(" а^b " + binary[e]);
        System.out.println("~a&b|a&-b = " + binary[f]);
        System.out.println(" ~а= " + binary[g]);
    }

}