package homework_19.Lilit_Adamyan;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ExtendedList<T> extends ArrayList<T> {

    public ExtendedList(List<T> list) {
        super(list);
    }

    public ExtendedList() {
        super();
    }

    /**
     * implement a method that will apply the given function to all elements of the extendedList
     *
     * @param function mapper function
     * @param <R>      the type of the element in the returned collection.
     * @return extended list of R type
     */
    public <R> ExtendedList<R> map(Function<T, R> function) {

        return stream()
                .map(function)
                .collect(Collectors.toCollection(ExtendedList::new));
    }

    /**
     * Implement a method that will fill the array with the elements provided by supplier function
     *
     * @param supplier the function that will generate an element for the Extended List.
     * @param count    the amount fo the elements that should be generated.
     */
    public void fill(Supplier<T> supplier, int count) {
      clear();
        for (int i = 0; i < count; i++) {
            add(supplier.get());
        }
    }

    /**
     * Implement a method that will apply the given predicate and return true if the predicate returns true for all elements in the ExtendedList
     *
     * @param predicate function to make a test
     * @return true if test is true for all elements in the ExtendedList, otherwise return false
     */
    public boolean forAll(Predicate<T> predicate) {
        return stream().allMatch(predicate);
    }

    /**
     * Implement a method that will divide the extended list into two partitions by the given predicate
     *
     * @param predicate function to make a test
     * @return the list of partitions, usually this should contain two extended list 1. the test is true 2. the test is false
     */
    public List<ExtendedList<T>> partition(Predicate<T> predicate) {
        List<T> trueList = new ArrayList<>();
        List<T> falseList = new ArrayList<>();
        for (T item : this) {
            if (predicate.test(item)) {
                trueList.add(item);
            } else {
                falseList.add(item);
            }
        }
        List<ExtendedList<T>> partitions = new ArrayList<>();
        partitions.add(new ExtendedList<>(trueList));
        partitions.add(new ExtendedList<>(falseList));
        return partitions;
    }

    /**
     * Implement a method that will apply the given Binary Operator to all elements of the Extended List
     *
     * @param binaryOperator
     * @param identity initial value.
     * @return the resulted value
     */
    public T reduce(BinaryOperator<T> binaryOperator, T identity) {
       return stream()
               .reduce(binaryOperator)
               .orElse(identity);
    }

}
