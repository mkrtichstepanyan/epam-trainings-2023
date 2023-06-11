package homework_21.qnarik_khachatryan;

public class Math {

    public int min(int[] sortedArray) {
        return sortedArray[0];
    }

    public int max(int[] sortedArray) {
        return sortedArray[sortedArray.length - 1];
    }

    public int avg(int[] sortedArray, int attempts) {

        int sum = 0;
        for (int result : sortedArray) {
            sum += result;
        }
        return sum / attempts;

    }

    public int median(int[] sortedArray, int attempts) {
        return attempts % 2 == 0 ? (sortedArray[attempts / 2] +
                sortedArray[attempts / 2 - 1]) / 2 : sortedArray[attempts / 2];
    }


}
