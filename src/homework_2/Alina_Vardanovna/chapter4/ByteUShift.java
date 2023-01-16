package homework_2.Alina_Vardanovna.chapter4;

public class ByteUShift {

    public static void main(String[] args) {

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
                'c', 'd', 'e', 'f'};
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);

        System.out.println(" Ь = Ох" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" Ь >> 4 = Ох" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" Ь >>> 4 = Ох" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println(" (Ь & Ox0f) >> 4 = Ох" + hex[(0) & 0x0f] + hex[e & 0x0f]);

    }

}
