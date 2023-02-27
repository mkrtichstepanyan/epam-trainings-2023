package homework_9.Qnarik_Khachatryan.chapter_12.Apple;

class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all Apple constants:");

        // use values()
        // first implementation
        Apple[] allapples = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);
        }
        System.out.println();

        // second implementation
        for (Apple a : Apple.values())
            System.out.println(a);

        System.out.println();

        // use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
