package homework_2.garik_gharibyan;

public class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'a', 'b',
                'c', 'd', 'e', 'f'
        };

        int i = 0xf1;
        byte b = (byte) i;

        System.out.println(i);
        System.out.println(b);

        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
