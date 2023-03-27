package homework_14.Shushanik_araqelyan;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is" + w);


//this won't compile because String is not a subclass of Number
//String[ strs = {"1","2","3","4","5"};
//Stats<String>strob = newStats<String>(strs);
//double x = strob.average();
//System.out.println("strob average is" + v);
    }
}