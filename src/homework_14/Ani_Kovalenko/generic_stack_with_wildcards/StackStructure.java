package homework_14.Ani_Kovalenko.generic_stack_with_wildcards;

public class StackStructure <T>{

    private Object [] values = new Object[10];
    private int index = -1;

    public void push(T inputValue) {
        if (index < values.length) {
            if (index == (values.length*70)/100) {
                T[] newArray = (T[]) new Object[values.length * 2];
                for (int i = 0; i < values.length; i++) {
                    newArray[i] = (T) values[i];
                }
                values = newArray;
            }
            values[++index] = inputValue;
        }
    }

    public T pop() {
        T outputValue;
        if (index > -1) {
            outputValue = (T) values[index--];
            return outputValue;
        }
        return  (T) "The end of stack";
    }
}
