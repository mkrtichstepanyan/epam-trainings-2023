package homework_11.garik_gharibyan.chapter_22.file;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Here are some numeric values in different formats.\n");
        System.out.printf("Various Integer format: ");
        System.out.printf("%d %(d %+d %05d\n",3,-3,3,3);
        System.out.println();
        System.out.printf("default floating-point format: %f\n",123456.12);
        System.out.printf("floating-point with coomas: %,f\n",1234562.12);
        System.out.printf("negative floating-point default: %,f\n",-1234562.12);
        System.out.printf("negative floating-point options: %,(f\n",-1234562.12);
        System.out.println();
        System.out.print("Line up positive and negative value: \n");
        System.out.printf("% ,.2f\n% ,.2f\n" , 123456.123,-123456.123);

    }
}