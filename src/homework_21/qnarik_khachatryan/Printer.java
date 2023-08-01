package homework_21.qnarik_khachatryan;

import java.util.Arrays;

public class Printer {
    public void print(int arrayLength, int attempts, int[][] results) {
        System.out.println("Array length - " + arrayLength + ", attempts (parallel runs) - " + attempts);
        System.out.print("          |");
        for (int i = 1; i <= attempts; i++) {
            System.out.print(" run " + i + " |");
        }
        System.out.print("  min  |  max  |  avg  | median");
        System.out.println();
        for (SortingTypes types : SortingTypes.values()) {
            System.out.printf("%-10s", types);
            int[] algorithmResults = results[types.ordinal()];

            Arrays.sort(algorithmResults);

            for (int result : algorithmResults) {
                System.out.printf("| %5d ", result);
            }
            Math math = new Math();
            System.out.printf("| %5d | %5d | %5d | %5d%n", math.min(algorithmResults), math.max(algorithmResults),
                    math.avg(algorithmResults, attempts), math.median(algorithmResults, attempts));
        }
    }
}