package homework_15.garik_gharibyan;

class DividedArray {
    int[] first;
    int[] second;

    DividedArray(int[] first, int[] second) {
        this.first = first;
        this.second = second;
    }
    
    public int getSize(){
        return first.length + second.length;
    }

}