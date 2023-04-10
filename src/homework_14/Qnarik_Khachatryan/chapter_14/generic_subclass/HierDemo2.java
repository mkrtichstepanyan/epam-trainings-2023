package homework_14.Qnarik_Khachatryan.chapter_14.generic_subclass;


class HierDemo2 {
    public static void main(String[] args) {

        //Create a Gen2 object for String.
        Gen<String> w = new Gen<String>("Hello ", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
