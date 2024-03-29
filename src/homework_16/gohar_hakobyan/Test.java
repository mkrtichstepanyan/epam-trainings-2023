package homework_16.gohar_hakobyan;

public class Test {

    public static void main(String[] args) {
        DynamicArray myDynamicArray = new DynamicArray(5);

        for (int i = 0; i < 14; i++) {
            myDynamicArray.add(i);
        }
        System.out.println(myDynamicArray.getSize());

        //remove by index
//        myDynamicArray.remove(5);
//        System.out.println(myDynamicArray.getSize());

        //remove by index
//        myDynamicArray.clear();
//        System.out.println(myDynamicArray.getSize());

        //cloned the array
        System.out.println(myDynamicArray.clone());

        System.out.println(myDynamicArray.contains(5555));
//        myDynamicArray.removeAll();

//       myDynamicArray.subList(2, 5);

        myDynamicArray.set(5, 2);
        System.out.println(myDynamicArray.get(5));

        myDynamicArray.sort();

//        myDynamicArray.toString();

        myDynamicArray.trimToSize();
        System.out.println(myDynamicArray.getSize());
        myDynamicArray.removeRange(5, 7);
        System.out.println(myDynamicArray.getSize());

        myDynamicArray.addByIndex(2, 5);

        int[] newArray = {55, 1122, 47, 4, 15};
        myDynamicArray.addAllByIndex(1, newArray);

        GenericDynamicArray <Object> array = new GenericDynamicArray<>();

        Address address = new Address("Ani", "P.Sevak", 15);
        User user = new User("Poghos","Poghosyan", 34, address);
        array.add(user);
        array.clone();


    }
}
