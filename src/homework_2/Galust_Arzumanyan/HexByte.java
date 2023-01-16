package homework_2.Galust_Arzumanyan;

//This method is used to demonstrate masking sign extension
class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        /*
        b - 1111_0001: -15
        b>>4 -  1111_1111: 255
        0x0f - 0000_1111: 15
         */
        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
