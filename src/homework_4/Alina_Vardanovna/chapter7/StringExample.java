package homework_4.Alina_Vardanovna.chapter7;

import java.util.Locale;

public class StringExample {

    public static void main(String[] args) {

        String name = "    A lina  ";
        System.out.println(name);

        String trimName = name.trim();
        System.out.println(trimName);
//      System.out.println(name.trim()); կամ կարելի է գրել այսպես:
//      Էս մեթոդով հանում ենք դիմացի ու վերջի պռաբելները:

        System.out.println(trimName.toUpperCase());
        System.out.println(trimName.toLowerCase(Locale.ROOT));
//      Էս մեթոդներով տառերը դարձնում ենք մեծատառ կամ փոքրատառ:

        String ly = "Perfectly";
        System.out.println(ly.endsWith("ly"));
        System.out.println(ly.startsWith("ly"));
//      Ցույց է տալիս, թե արդյո՞ք վերջանում է կամ սկսվում է "ly"-ով:

        String Names = "Alina Hakobyan";
        System.out.println(Names.substring(6, Names.length()));
        System.out.println(Names.substring(1, 5));
//      substring մեթոդը կարելի է օգտագործել 2 ձևով՝ սկզբից մինչև length կամ սկզբի ինդեքսից մինչև վերջին ինդեքս:

        String fullName = "Ալինա Հակոբյան Վարդանի";
        String[] result = fullName.split(" ");
        if (result.length >= 2) {
            System.out.println(result[0]);
            System.out.println(result[1]);
            System.out.println(result[2]);
        }
//      Պռաբելով կտրում է անոււնը, ազգանունը կամ հայրանունը:

        String charName = "Ալինա Հակոբյան Վարդանի";
        char[] chars = charName.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
//      String-ը դարձնում ենք char-երի մասիվ, որ վրան for ֆռանք:

        System.out.println();
        char c = charName.charAt(3);
        System.out.println(c);
//      Տպում է միայն 1 էլեմենտ:

        char[] chars1 = charName.toCharArray();
        String result1 = "";
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == 'ա') {
                result1 += 'Ա';
            } else {
                result1 += chars1[i];
            }
        }
        System.out.println(result1);
//      Ինչքան որ 'ա' է տեսնում, դարձնում է 'Ա':


    }
}