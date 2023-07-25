package homework_21.Ani_Kovalenko;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        int index = 0;
        int arrayLength = 100;
        int[] arrayToSort = new int[arrayLength];

        for (int i = arrayLength; i > 0; i--) {
            arrayToSort[index++] = i;
        }

        ThreadLifeCycle lifeCycle = new ThreadLifeCycle();
        lifeCycle.organizeLifeCycle(arrayToSort);
    }
}