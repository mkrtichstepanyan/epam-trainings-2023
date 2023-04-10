package homework_16.hovhannes_Gspeyan.genericDynamicArray;

import homework_16.hovhannes_Gspeyan.model.Address;
import homework_16.hovhannes_Gspeyan.model.Person;

public class GenericDynamicArrayTest {

    public static void main(String[] args) throws Exception {
        GenericDynamicArray<String> gda = new GenericDynamicArray<>();
        gda.add("abba");
        gda.printArray();
        String[] arr = {"poxos", "valod", "petros"};
        gda.addAll(arr);
        gda.printArray();
        gda.addByIndex(2, "Hovo");
        gda.printArray();
        gda.addAllByIndex(3, new String[]{"John", "Travolta", "Alex"});
        gda.printArray();
        GenericDynamicArray<Person> gda1 = new GenericDynamicArray<>();
        Person person = new Person("Poghos", "Poghosyan",15,
                new Address("Armenia", "Gyumri","Charents",15));
        Person person1 = new Person("Petros", "Petrosyan",20,
                new Address("France", "Paris","Yellowstone ave.",22));
        gda1.add(person);
        gda1.add(person1);
        gda1.deepClone(new Person[]{person,person1});
        gda1.trimToSize();
        gda1.printArray();
        gda.trimToSize();
        gda.printArray();
    }
}
