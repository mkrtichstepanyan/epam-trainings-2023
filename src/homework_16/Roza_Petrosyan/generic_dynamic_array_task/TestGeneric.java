package homework_16.Roza_Petrosyan.generic_dynamic_array_task;

public class TestGeneric {
    public static void main(String[] args) throws CloneNotSupportedException {
        DynamicArray<String> strDynamicArray = new DynamicArray<>(4);
        strDynamicArray.add("hello");
        strDynamicArray.add("from");
        strDynamicArray.add("homework-16");
        strDynamicArray.add(1, "everyone");
        strDynamicArray.addAll(new String[]{"dynamic", "array"});
        strDynamicArray.addAll(4, new String[]{"about", "generic"});
        System.out.println("Generic Dynamic array after add() and addAll() methods:");
        System.out.println(strDynamicArray);
        System.out.println();

        System.out.println("Generic Dynamic array after indexOf(\"from\") methods:");
        System.out.println(strDynamicArray.indexOf("from"));
        System.out.println();

        System.out.println("Generic Dynamic array after contains(\"hi\") methods:");
        System.out.println(strDynamicArray.contains("hi"));
        System.out.println();

        System.out.println("Generic Dynamic array after containsAll(new String[]{\"hello\", \"generic\"}) methods:");
        System.out.println(strDynamicArray.containsAll(new String[]{"hello", "generic"}));
        System.out.println();

        System.out.println("Generic Dynamic array after remove(1) methods:");
        System.out.println(strDynamicArray.remove(1));
        System.out.println(strDynamicArray);
        System.out.println();

        System.out.println("Generic Dynamic array after removeAll(new String[]{\"about\", \"from\"}) methods:");
        System.out.println(strDynamicArray.removeAll(new String[]{"about", "from"}));
        System.out.println(strDynamicArray);
        System.out.println();

        System.out.println("Generic Dynamic array after subList(1, 3) methods:");
        System.out.println(strDynamicArray.subList(1, 3));
        System.out.println();

        System.out.println("Generic Dynamic array after set(0, \"hi\") methods:");
        System.out.println(strDynamicArray.set(0, "hi"));
        System.out.println(strDynamicArray);
        System.out.println();

        System.out.println("Generic Dynamic array after sort() methods:");
        strDynamicArray.sort();
        System.out.println(strDynamicArray);
        System.out.println();

        System.out.println("Generic Dynamic array after removeRange(2, 3) methods:");
        strDynamicArray.removeRange(2, 3);
        System.out.println(strDynamicArray);
        System.out.println();

        System.out.println("Generic Dynamic array after replaceAll(String::toUpperCase) methods:");
        strDynamicArray.replaceAll(String::toUpperCase);
        System.out.println(strDynamicArray);
        System.out.println();

        System.out.println("Generic Dynamic array after clone() methods:");
        Object strDynamicClonedArray = strDynamicArray.clone();
        System.out.println(strDynamicClonedArray);
        System.out.println();

        System.out.println("Generic Dynamic array after isEmpty() methods:");
        System.out.println(strDynamicArray.isEmpty());
        System.out.println();

        System.out.println("Generic Dynamic array after clear() methods:");
        strDynamicArray.clear();
        System.out.println(strDynamicArray);
    }
}
