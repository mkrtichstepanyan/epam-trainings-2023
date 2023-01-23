package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate search an array using for-each style for
class Search {
    public static void main(String[] args) {
        int[] num = {5, 4, 9, 7, 2, 8, 1, 3, 6};
        int val = 5;
        boolean found = false;

        // use for-each style for to search num from val
        for (int x : num) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(" Value found! ");
        }
    }
}
