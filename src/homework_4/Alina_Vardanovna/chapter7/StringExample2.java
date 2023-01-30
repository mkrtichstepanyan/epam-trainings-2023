package homework_4.Alina_Vardanovna.chapter7;

public class StringExample2 {

    public static void main(String[] args) {

        String name = new String("Alina");
        String name1 = "Alina";
/*       boolean result = name == name1; Այս ձևով 2 սթրինգի հավասարություն չենք ստուգում,
         որովհետև ստուգվում է միայն նույն դարակում է թե ոչ,
         բայց equals մեթոդով ստուգվում է հենց դարակի միջի պարունակությունները
 */
        boolean result = name.equals(name1);
        System.out.println(result);

        String name2 = "Hakobyan";
        String name3 = "Hakobyan";
        if (name.equals(name1) && name.equals(name2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


//        name += " Vardanovna";
//
//        System.out.println(name);
//        System.out.println(name1);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 1000; i++) {
//            stringBuilder.append("Poxos");
//            stringBuilder.append(i);
//            stringBuilder.append(',');
//        }
//
//        stringBuilder.append(2);
//        stringBuilder.append(',');
//        stringBuilder.append("Lilit");
//
//        System.out.println(stringBuilder);


    }
}
