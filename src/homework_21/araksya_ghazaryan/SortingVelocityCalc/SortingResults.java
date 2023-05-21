package homework_21.araksya_ghazaryan.SortingVelocityCalc;

import java.util.Arrays;
class SortingResults {
    private SortingAlgorithm[] algorithms;
    private int[][] sortingTimes;
    private int attempts;

    public SortingResults(SortingAlgorithm[] algorithms, int[][] sortingTimes, int attempts) {
        this.algorithms = algorithms;
        this.sortingTimes = sortingTimes;
        this.attempts = attempts;
    }

    public void printResults() {
        String[] algorithmNames = {"bubble", "selec", "quick", "merge"};

        System.out.println(String.format("%-8s | %-8s | %-8s | %-8s | %-8s | %-4s | %-4s | %-6s | %-6s",
                "", "run 1", "run 2", "run 3", "run 4", "min", "max", "avg", "median"));

        for (int i = 0; i < algorithms.length; i++) {
            SortingAlgorithm algorithm = algorithms[i];
            int[] times = sortingTimes[i];
            Arrays.sort(times);

            int min = times[0];
            int max = times[times.length - 1];
            double average = Arrays.stream(times).average().orElse(0);
            int median = times[times.length / 2];

            System.out.println(String.format("%-8s | %-8d | %-8d | %-8d | %-8d | %-4d | %-4d | %-6.2f | %-6d",
                    algorithmNames[i], times[0], times[1], times[2], times[3], min, max, average, median));
        }
    }
}
