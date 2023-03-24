package homework_14.Ani_Kovalenko.generic_stack_with_nums;

public class StackStructure <Type extends Number> {

    private Number[] values = new Number[10];
    private int index = 0;

    public void push(Type inputValue) {
        if (index < values.length) {
            if (index == (values.length*70)/100) {
                Number[] newArray = new Number[values.length * 2];
                for (int i = 0; i < values.length; i++) {
                    newArray[i] = values[i];
                }
                values = newArray;
            }
            values[index++] = inputValue;
        }
    }

    public Type pop() {
        Type outputValue;
        if (index > -1) {
            outputValue = (Type) values[--index];
            return outputValue;
        }
        return null;
    }
}
