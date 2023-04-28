package homework_16.yeghia_ansuryan.generic_dynamic_array;

public class Test {

    public static void main(String[] args) {
        GenericArray<Number> myGenericArray = new GenericArray<>(5);

        for (int i = 0; i < 14; i++) {
            myGenericArray.add(i);
        }
        System.out.println();

        System.out.println();
        System.out.println("Printed array" + " " + myGenericArray);
        System.out.println("--------------------");

        System.out.println();
        myGenericArray.add(4, 777);
        System.out.println("Printed addByIndex method" + " " + myGenericArray);
        System.out.println("--------------------");

        Number[] dell = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        System.out.print("Printed dell: ");
        for (Number num : dell) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        myGenericArray.addAll(dell);
        System.out.println("Printed addAll method" + " " + myGenericArray);
        System.out.println("---------------------");

        System.out.println();
        Number[] asus = {99, 88, 77, 66};
        myGenericArray.addAll(4, asus);
        System.out.println("Printed addAllByIndex method" + " " + myGenericArray);
        System.out.println("---------------------");

        System.out.print("Printed clone method" + " ");
        for (int i = 0; i < myGenericArray.clone().length; i++) {
            System.out.print(myGenericArray.clone()[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------");

        System.out.println("Printed contains method" + " " + myGenericArray.contains(3));
        System.out.println("---------------------");


        System.out.println("Printed indexOf method" + " " + myGenericArray.indexOf(8));
        System.out.println("---------------------");

//        System.out.println("Printed remove method" + " " + myDynamicArray.remove(14));
        System.out.println(myGenericArray);
        System.out.println("---------------------");

        System.out.println("Printed containsAll method" + " " + myGenericArray.containsAll(dell));
        System.out.println("---------------------");

        System.out.println("Printed removeAll method" + " " + myGenericArray.removeAll(dell));
        System.out.println(myGenericArray);
        System.out.println("---------------------");

        System.out.println("Printed isEmpty method" + " " + myGenericArray.isEmpty());
        System.out.println("--------------------");

        System.out.print("Printed subList method" + " ");
        Object[] num = myGenericArray.subList(1, 3);
        for (Object j : num) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        System.out.println("Printed set method" + " " + myGenericArray.set(2, 35));
        System.out.println("--------------------");

        System.out.println(myGenericArray);
        myGenericArray.sort();
        System.out.println("Printed sort method" + " " + myGenericArray);
        System.out.println("--------------------");

        System.out.println("Printed toString method" + " " + myGenericArray);
        System.out.println("--------------------");

        System.out.println();
        myGenericArray.trimToSize();
        System.out.println("Printed trimToSize method" + " " + myGenericArray);
        System.out.println("---------------------");

        System.out.println(myGenericArray);
        myGenericArray.removeRange(2, 5);
        System.out.println("Printed removeRange method" + " " + myGenericArray);
        System.out.println("---------------------");

        Number[] hp = {6.235, 5.5468, 4.22, 3.0, -2.12, 1.87, 0.521, 55, 44, 11, 12};
        myGenericArray.replaceAll(hp);
        System.out.println("Printed replaceAll method" + " " + myGenericArray);
        System.out.println("---------------------");

        myGenericArray.clear();
        System.out.println("Printed clear method" + " " + myGenericArray);
        System.out.println("---------------------");

    }
}
