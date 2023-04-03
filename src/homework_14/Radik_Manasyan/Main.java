package homework_14.Radik_Manasyan;

public class Main {
    public static void main(String[] args) {
        GenericStack<Student> studentStack = new GenericStack<>();
        Student student1 = new Student("Tom", 22);
        Student student2 = new Student("Jerry", 35);
        studentStack.add(student1);
        studentStack.add(student2);
        studentStack.getByIndex(1);

        studentStack.print();


        GenericStack<String> strStack = new GenericStack<>();
        strStack.add("Hello");
        strStack.getByIndex(0);
        strStack.add("Java");
        strStack.print();

        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.add(5);
        intStack.add(123);
        intStack.print();

    }

}
