package homework_14.Qnarik_Khachatryan.chapter_14;

class WildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double[] dums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("fob average is " + x);

        //See which arrays have some average.
        System.out.print("Averages of iob and dob ");
        if (iob.isSameAvg(dob)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }

        System.out.print("Averages of iob and fob ");
        if (iob.isSameAvg(fob)) {
            System.out.println("are the same.");
        } else {
            System.out.println("differ.");
        }
    }
}
