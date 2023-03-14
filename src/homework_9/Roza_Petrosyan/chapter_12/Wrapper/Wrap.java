package homework_9.Roza_Petrosyan.chapter_12.Wrapper;

public class Wrap {
    public static void main(String[] args) {
        Character ch = Character.valueOf((char) 2);
        Boolean bul = Boolean.FALSE;
        Boolean bul2 = Boolean.valueOf (Boolean.FALSE);
        System.out.println(ch);
        System.out.println(bul2.booleanValue());

        Byte b = Byte.valueOf((byte) 23);
        System.out.println(b.byteValue());

        Integer num = Integer.valueOf("79");
        int i = num.intValue();
        System.out.println(i);
    }
}
