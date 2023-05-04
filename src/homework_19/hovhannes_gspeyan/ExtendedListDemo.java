package homework_19.hovhannes_gspeyan;

import homework_19.hovhannes_gspeyan.comparator.StudentNameComparator;
import homework_19.hovhannes_gspeyan.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class ExtendedListDemo {
    public static void main(String[] args) {

        // creating three ExtendedList instances(integerList, stringList and my custom studentList)
        ExtendedList<Integer> integerList = new ExtendedList<>();
        ExtendedList<String> stringList = new ExtendedList<>();
        ExtendedList<Student> studentList = new ExtendedList<>();

        // adding values to integerList
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        // using iterator in order to iterate through integerList
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " | ");
        }
        System.out.println();

        // using ExtendList's map() method
        List<Integer> modifiedList = new ArrayList<>(integerList.map(x -> x * x));
        System.out.println(modifiedList);

        // using ExtendList's fill() method
        stringList.fill(() -> "hello ", 1);
        stringList.fill(() -> "hi ", 3);
        stringList.fill(() -> "ola ", 5);
        System.out.println(stringList);

        // using ExtendList's forAll() method
        Optional<Boolean> allPositive = Optional.of(Optional.of(integerList.forAll(n -> n > 0)).orElse(false));
        System.out.println(allPositive);
        Optional<Boolean> allEven = Optional.of(Optional.of(integerList.forAll(n -> n % 2 == 0)).orElse(false));
        System.out.println(allEven);

        // using ExtendList's partition() method
        List<ExtendedList<String>> partitions = new ArrayList<>(stringList.partition(s -> s.contains("h")));
        Optional.of(partitions.get(0)).orElse(new ExtendedList<>()).forEach(System.out::print);
        System.out.println();
        Optional.of(partitions.get(1)).orElse(new ExtendedList<>()).forEach(System.out::print);

        // using ExtendList's reduce() method
        System.out.println();
        Optional<Integer> max = Optional.of(integerList.reduce(Integer::max, Integer.MIN_VALUE));
        System.out.println("Maximum elements in the list: " + max.orElse(-1));
        Optional<Integer> sum = Optional.of(integerList.reduce(Integer::sum, -1));
        System.out.println("The sum of elements in the list: " + sum.orElse(-1));

        // creating four users
        Student student1 = new Student("John", "Doe", 20);
        Student student2 = new Student("Alex", "Sharp", 18);
        Student student3 = new Student("Mike", "Owen",22);
        Student student4 = new Student("Vincent", "Olsen", 25);

        // using custom fill method to add students to studentList
        studentList.fill(()->student1,1);
        studentList.fill(()->student2,1);
        studentList.fill(()->student3,1);
        studentList.fill(()->student4,1);

        // creating student name comparator instance to compare students by name
        StudentNameComparator comparator = new StudentNameComparator();

        // opened stream from student list, sorted their names and passed it other collection
        // after it declared for each loop to iterate through list in order to print sorted names of students
        Collection<Student> collect = studentList.stream()
                .sorted(comparator)
                .collect(Collectors.toCollection(ExtendedList::new));

        for (Student student : collect) {
            System.out.print(student.getName() + " ");
        }
    }
}
