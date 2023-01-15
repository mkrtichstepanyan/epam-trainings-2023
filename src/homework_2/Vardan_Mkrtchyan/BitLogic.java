/*
        char[] charArray = ("abcdefe").toCharArray();
        for (char q: charArray) {
            System.out.println(binary[q]);
        }
*/

package homework_2.Vardan_Mkrtchyan;

public class BitLogic {
    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0011
        int b = 6; // 0110
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a ^ b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

    }
}
