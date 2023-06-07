package homework_21.hovhannes_gspeyan;

import homework_21.hovhannes_gspeyan.sortingApi.SortContainer;
import homework_21.hovhannes_gspeyan.sortingApi.Type;
import homework_21.hovhannes_gspeyan.util.CalculationUtility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static homework_21.hovhannes_gspeyan.sortingApi.SortVelocityCalculator.calculateSortingTime;
import static homework_21.hovhannes_gspeyan.sortingApi.SortVelocityCalculator.generateArray;
import static homework_21.hovhannes_gspeyan.util.CalculationUtility.getMedian;
import static homework_21.hovhannes_gspeyan.util.CalculationUtility.getType;

public class SortingSpeedDemo {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int length;
        int attempts;

        System.out.print("Enter the length of an array- ");
        length = console.nextInt();

        System.out.print("Enter the count of attempts for the sorting types- ");
        attempts = console.nextInt();

        List<Integer> array = generateArray(length);
        Collections.shuffle(array);


        List<CalculationUtility> calculations = Arrays.stream(Type.values())
                .map(type -> calculateSortingTime(array, attempts, SortContainer.getSorter(type)))
                .map(longs -> longs.stream().mapToLong(value -> value).summaryStatistics())
                .map(s -> new CalculationUtility(s, getType(), s.getMin(), s.getMax(),
                        s.getAverage(), getMedian(array))).toList();


        Type[] values = Type.values();
        for (Type type : values) {
            for (CalculationUtility calc : calculations) {
                System.out.println(type + "\n" +  " max is " + calc.getMax());
                System.out.println(" min is " + calc.getMin());
                System.out.println(" average is " + calc.getAvg());
                System.out.println(" median is " + calc.getMedian());
            }
            System.out.println();
        }
    }

}
