package homework_19.Radik_Manasyan;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExtendedList<T> extends ArrayList<T> {
    private final ExtendedList<T> eList;

    public ExtendedList() {
        super();
        eList = this;
    }

    /**
     * implement a method that will apply the given function to all elements of the extendedList
     *
     * @param function mapper function
     * @param <R>      the type of the element in the returned collection.
     * @return extended list of R type
     */
    public <R> ExtendedList<R> map(Function<T, R> function) {
        ExtendedList<R> tmpList = new ExtendedList<>();
        eList.forEach((e) -> tmpList.add(function.apply(e)));
        return tmpList;
    }

    /**
     * Implement a method that will fill the array with the elements provided by supplier function
     *
     * @param supplier the function that will generate an element for the Extended List.
     * @param count    the amount fo the elements that should be generated.
     */
    public void fill(Supplier<T> supplier, int count) {
        List<T> list = Stream.generate(supplier).limit(count).toList();
        for (T t : list) {
            eList.add(t);
        }


    }

    /**
     * Implement a method that will apply the given predicate and return true if the predicate returns true for all elements in the ExtendedList
     *
     * @param predicate function to make a test
     * @return true if test is true for all elements in the ExtendedList, otherwise return false
     */
    public boolean forAll(Predicate<T> predicate) {
        boolean flag = true;
        for (T t : eList) {
            if (!predicate.test(t)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    /**
     * Implement a method that will divide the extended list into two partitions by the given predicate
     *
     * @param predicate function to make a test
     * @return the list of partitions, usually this should contain two extended list 1. the test is true 2. the test is false
     */
    public List<ExtendedList<T>> partition(Predicate<T> predicate) {
        List<ExtendedList<T>> extendedLists = new ExtendedList<>();
        ExtendedList<T> trueLIst = new ExtendedList<>();
        ExtendedList<T> falseLIst = new ExtendedList<>();

        for (T t : eList) {
            if (predicate.test(t)) {
                trueLIst.add(t);
            } else {
                falseLIst.add(t);
            }
        }
        extendedLists.add(trueLIst);
        extendedLists.add(falseLIst);
        return extendedLists;
    }

    /**
     * Implement a method that will apply the given Binary Operator to all elements of the Extended List
     *
     * @param binaryOperator
     * @param identity       initial value.
     * @return the resulted value
     */
    public T reduce(BinaryOperator<T> binaryOperator, T identity) {
        T apply = null;

        if (eList.size() == 0) {
            return identity;
        } else if (eList.size() == 1) {
            return eList.get(0);
        }
        apply = binaryOperator.apply(eList.get(0), eList.get(1));

        for (int i = 2; i < eList.size(); i++) {
            apply = binaryOperator.apply(apply, eList.get(i));
        }

        return apply;
    }

}
