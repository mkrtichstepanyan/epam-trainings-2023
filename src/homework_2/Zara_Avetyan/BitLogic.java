package homework_2.Zara_Avetyan;

public class BitLogic {
    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; //     0011
        int b = 6; //     0110
        int c = a | b; // 0111
        int d = a & b; // 0010
        int e = a ^ b; // 0101
        int f = (~a & b) | (a & ~b); //(0100) | (0001) = 0101
        int g = ~a & 0x0f; // 15
        System.out.println("        a = " + binary[a]);
        System.out.println("        b = " + binary[b]);
        System.out.println("      a|b = " + binary[c]);
        System.out.println("      a&b = " + binary[d]);
        System.out.println("      a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println("       ~a = " + binary[g]);
    }
}
