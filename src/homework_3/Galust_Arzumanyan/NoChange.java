package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate the for-each loop essentially read-only
class NoChange {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : num) {
            System.out.println(x + " ");
            x = x * 10; // no effect on num
        }
        System.out.println();

        for (int x : num)
            System.out.println(x + " ");

        System.out.println();
    }
}
