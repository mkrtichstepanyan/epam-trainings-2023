package homework_14.Qnarik_Khachatryan.chapter_14.overriding;

class OverrideDemo {
    public static void main(String[] args) {
        //Create a Gen object for Integers
        Gen<Integer> iOb = new Gen<Integer>(88);

        //Create a Gen2 object for Integers
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        //Create a Gen2 object for Strings
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }

}
