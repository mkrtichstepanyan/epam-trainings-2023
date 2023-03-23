package homework_14.Qnarik_Khachatryan.chapter_14;

class HierDemo {
    public static void main(String[] args) {
        //Create a Gen2 object for String and Integer.

        Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
