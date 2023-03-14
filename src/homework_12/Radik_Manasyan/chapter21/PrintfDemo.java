package homework_12.Radik_Manasyan.chapter21;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Ниже приведины некоторые числовые значения в разных форматах.\n");

        System.out.printf("Разные целочисленные форматы: ");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Формат чисел с плавающей точкой по умолчанию: %f\n", 1234567.123);
        System.out.printf("Формат чисел с плавающей точкой раделяемых запятыми: %,f\n", 1234567.123);
        System.out.printf("Формат отрецательных чисел с плавающей точкой по умолчанию: %,f\n", -1234567.123);
        System.out.printf("Другой формат отрецательных чисел с плавающей точкой по умолчанию: %, (f\n", -1234567.123);

        System.out.println();

        System.out.printf("Выравнение положительных и отрецательных числовых значенний:\n");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.12, -1234567.12);

    }
}
