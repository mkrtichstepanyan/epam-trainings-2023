package homework_16.InesaMkrtchyan;

public class DynamicArray {
    private int[] arr;
    private int currentEmptyIndex;
    private int length;

    public DynamicArray() {
        length = 10;
        arr = new int[length];
        currentEmptyIndex = -1;
    }
    public int getSize(){
        return currentEmptyIndex;
    }
    public int getByIndex(int index){
        if(index >=0 && index <= currentEmptyIndex){
            return arr[index];
        }
        return -1;
    }
    public void add(int value) {
        if (currentEmptyIndex >= length) {
            int[] newArr = new int[length * 2];
            for (int i = 0; i < length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[++currentEmptyIndex] = value;
    }

    public void addAll(int... values) {
        for (int i : values) {
            add(i);
        }
    }

    public void clear() {
        arr = new int[0];
        currentEmptyIndex = -1;//we can only do it
        length = 10;
    }

    public DynamicArray clone() {
        DynamicArray myArray = new DynamicArray();
        myArray.addAll(this.arr);
        return myArray;
    }

    public boolean contains(int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i <= currentEmptyIndex; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int value) {
        int index = indexOf(value);
        if (index < 0) {
            return;
        }
        if(index == currentEmptyIndex){
            currentEmptyIndex--;
            return;
        }
        for (int i = index; i < currentEmptyIndex; i++) {
            arr[i] = arr[i + 1];
        }
        currentEmptyIndex--;
    }

    public void removeAll(int... values) {
        for (int item : values) {
            remove(item);
        }
    }

    public boolean isEmpty() {
        return currentEmptyIndex <= 0;
    }

    public void set(int index, int value) {
        if (index >= 0 && index <= currentEmptyIndex) {
            arr[index] = value;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void sort() {
        for (int i = 0; i < currentEmptyIndex ; i++) {
            for (int j = 0; j < currentEmptyIndex - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i : arr) {
            result.append(arr[i]).append(" ,");
        }
        return result.toString();
    }

    public void trimToSize() {
        int[] newArr = new int[currentEmptyIndex - 1];
        for (int i = 0; i <= currentEmptyIndex; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void removeRange(int start, int end) {
        if (start >= currentEmptyIndex || start < 0 || end > currentEmptyIndex || end < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = start; i <= end; i++) {
            if (i + end - start > currentEmptyIndex) return;
            arr[i] = arr[i + end - start];
        }
        currentEmptyIndex -= end - start;
    }

    public void replaceAll(int value, int newValue) {
        for(int i = 0; i < currentEmptyIndex; i++){
            if(arr[i] == value){
                arr[i] = newValue;
            }
        }
    }
}
