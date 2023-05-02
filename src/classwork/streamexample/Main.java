package classwork.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Streams is not data structure
public class Main {
    private Optional<String> shoesSize;

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        List<String> strings2 = new ArrayList<>();
        strings2.add("5");
        strings2.add("6");
        strings2.add("7");
        strings2.add("8");

        List<List<String>> container = List.of(strings2, strings);

        // intermediate operation
        // terminal operations
        // Lazy evaluation
        // stream is immutable
        // readable code
        // declarative programming

//         strings.stream()
//                .mapToInt(Integer::parseInt)
//
//                .forEach(s -> System.out.println(s));

//        IntStream intStream = container.stream().flatMap(strings1 -> strings1.stream())
//                .mapToInt(Integer::parseInt);



    }

}
