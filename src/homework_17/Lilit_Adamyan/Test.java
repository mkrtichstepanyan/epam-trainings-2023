package homework_17.Lilit_Adamyan;

public class Test {
    public static void main(String[] args) {

        GenericLinkedList<String> list = new GenericLinkedList<String>();

        // Add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Test size and isEmpty methods
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        // Test contains and containsAll methods
        System.out.println("Does the list contain 'apple'? " + list.contains("apple"));
        System.out.println("Does the list contain 'orange'? " + list.contains("orange"));
        String[] fruits = {"apple", "banana"};
        System.out.println("Does the list contain all 'apple' and 'banana'? " + list.containsAll(fruits));

        // Test addFirst method
        list.addFirst("orange");
        System.out.println("New size of list: " + list.size());
        System.out.println("First element of list: " + list.get(0));

        // Test addAll method
        String[] moreFruits = {"grape", "kiwi", "mango"};
        list.addAll(moreFruits);
        System.out.println("New size of list: " + list.size());
        System.out.println("Last element of list: " + list.get(list.size() - 1));

        // Test addAll method with index
        String[] evenMoreFruits = {"pear", "peach"};
        list.addAll(2, evenMoreFruits);
        System.out.println("New size of list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));

        // Test clear method
        list.clear();
        System.out.println("Size of list after clear: " + list.size());

        // Test set and remove methods
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("Original list: " + list);
        System.out.println("Setting element at index 1 to 'orange'");
        list.set(1, "orange");
        System.out.println("Updated list: " + list);
        System.out.println("Removing 'cherry'");
        list.remove("cherry");
        System.out.println("Updated list: " + list);

        // Test removeAll method
        String[] toRemove = {"orange", "banana"};
        list.removeAll(toRemove);
        System.out.println("Updated list after removing 'orange' and 'banana': " + list);

        // Test indexOf and lastIndexOf methods
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("Index of 'apple': " + list.indexOf("apple"));
        System.out.println("Last index of 'apple': " + list.lastIndexOf("apple"));
    }

}
