package homework_2.Ruzanna_Marutyan;
//Demonstrate ?
class Ternary {
    public static void main (String[] args) {
        int i, k;

        i=10;
        k=i<0?-i:i;//get absolut value of i        i is bigger than 0, so the second operation is performed (i) 10
        System.out.print("Absolute value of ");
        System.out.println(i+ "is" + k);

        i=-10;
        k=i<0?-i:i; //get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i+ "is" + k);
    }
}
