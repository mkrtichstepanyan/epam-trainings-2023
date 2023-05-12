package homework_19.rafik_pahlevanyan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtendedList<T> extends ArrayList<T> {

    public <R> ExtendedList<R> map(Function<T, R> function) {
        List<R> result = this.stream()
                .map(function)
                .collect(Collectors.toCollection(ExtendedList::new));
        return (ExtendedList<R>) result;

    }

    public void fill(Supplier<T> supplier, int count) {
        Stream.generate(supplier)
                .limit(count)
                .forEach(this::add);
    }

    public boolean forAll(Predicate<T> predicate) {
        return this.stream().allMatch(predicate);
    }

    public List<ExtendedList<T>> partition(Predicate<T> predicate) {
        Map<Boolean, List<T>> partitioned = this.stream()
                .collect(Collectors.partitioningBy(predicate));

        ExtendedList<T> truePartition = new ExtendedList<>();
        ExtendedList<T> falsePartition = new ExtendedList<>();
        truePartition.addAll(partitioned.get(true));
        falsePartition.addAll(partitioned.get(false));

        return Arrays.asList(truePartition, falsePartition);
    }

    public T reduce(BinaryOperator<T> binaryOperator, T identity) {
        return this.stream().reduce(identity, binaryOperator);
    }



}
