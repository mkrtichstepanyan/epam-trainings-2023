package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate continue
class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.print(" ");
        }
    }
}
