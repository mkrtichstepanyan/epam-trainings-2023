package homework_16.Ani_Kovalenko.generic_dynamic_array;

import java.lang.reflect.Method;
import java.util.ArrayList;


public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        int[] intArray = {22, 33};
        InnerObject innerObject = new InnerObject("str", 1);
        InnerObject innerObject2 = new InnerObject("str2", 2);
        InnerObject innerObject3 = new InnerObject("str3", 3);

        InnerObject[] arrayOfObjects = {innerObject2, innerObject3};
        InnerObject[] arrayOfObjects2 = {innerObject2, innerObject3};

        OuterObject outerObject = new OuterObject(1, intArray, innerObject, arrayOfObjects);
        OuterObject outerObject2 = new OuterObject(2, intArray, innerObject, arrayOfObjects2);

        DynamicArray<OuterObject> dynArr = new DynamicArray<>(5);

        dynArr.add(outerObject2);
        dynArr.add(outerObject);
        callMethods(dynArr);
    }

    private static void callMethods(DynamicArray<? extends OuterObject> dynArr) {
        callClone(dynArr);
        callRemove(dynArr);
        callAddAll(dynArr);
        callContains(dynArr);
        callContainsAll(dynArr);
        callIndexOf(dynArr);
        callRemoveAll(dynArr);
        callTrimToSize(dynArr);
        callIsEmpty(dynArr);
        callSubList(dynArr);
        callSet(dynArr);
        callSort(dynArr);
        callRemoveRange(dynArr);
        callAddByIndex(dynArr);
        callAddAllByIndex(dynArr);
        callReplaceAll(dynArr);
        callClear(dynArr);
    }


    private static void callAddByIndex(DynamicArray dynArr) {
        drawSeparator();
        OuterObject objectToAdd = makeObjects().get(0);
        dynArr.addByIndex(0, objectToAdd);
        System.out.println("Array after calling addByIndex() method: \n" + dynArr);
    }

    private static void callAddAllByIndex(DynamicArray dynArr) {
        drawSeparator();
        OuterObject[] arrayOfObjects = {makeObjects().get(1), makeObjects().get(2)};
        dynArr.addAllByIndex(1, arrayOfObjects);
        System.out.println("Array after calling addAllByIndex() method: \n" + dynArr);
    }

    private static void callTrimToSize(DynamicArray dynArr) {
        drawSeparator();
        System.out.println("Size before cutting: " + dynArr.getSize());
        dynArr.trimToSize();
        System.out.println("Array after calling trimToSize() method: \n" + dynArr);
        System.out.println();
    }

    private static void drawSeparator() {
        System.out.println("--------------------------");
        System.out.println();
    }

    private static void callReplaceAll(DynamicArray dynArr) {
        drawSeparator();
        OuterObject[] newArray = makeArrayToReplace();
        System.out.println();
        dynArr.replaceAll(newArray);
        System.out.println("Array after calling replaceAll() method: \n" + dynArr);
        System.out.println();
    }

    private static void callRemoveRange(DynamicArray dynArr) {
        drawSeparator();
        dynArr.removeRange(0, 1);
        System.out.println("Array after calling removeRange() method: \n" + dynArr);
        System.out.println();
    }

    private static void callSort(DynamicArray dynArr) {
        drawSeparator();
        dynArr.sort();
        System.out.println("Array after calling sort() method: \n" + dynArr);
        System.out.println();
    }

    private static void callSet(DynamicArray dynArr) {
        drawSeparator();

        OuterObject objectToChange = makeObjects().get(0);
        OuterObject newObject = new OuterObject(222, objectToChange.getArray(),
                objectToChange.getInnerObject(), objectToChange.getInnerObjects());

        System.out.println("Array before calling set() method: \n" + dynArr);
        System.out.println("Replaced element is: " + dynArr.set(0, newObject));
        System.out.println("Array after calling set() method: \n" + dynArr);
        System.out.println();
    }

    private static void callSubList(DynamicArray dynArr) {
        drawSeparator();
        System.out.println("Array before calling subList() method: \n" + dynArr);
        System.out.println("Returned list: ");
        for (Object listMember : dynArr.subList(0, 1)) {
            System.out.println(listMember);
        }
        System.out.println();

//        The case when start index is greater than end index.
//        System.out.println("Returned list: " + dynArr.subList(5,2));

//        The case when the start index is not valid.
//        System.out.println("Returned list: " + dynArr.subList(-2,5));

//        The case when the end index is not valid.
//        System.out.println("Returned list: " + dynArr.subList(2,555));
    }

    private static void callIsEmpty(DynamicArray dynArr) {
        drawSeparator();
        System.out.println("Array is empty: " + dynArr.isEmpty());
        System.out.println();
    }

    private static void callRemoveAll(DynamicArray dynArr) {
        drawSeparator();
        ArrayList<OuterObject> listToRemove = new ArrayList<>();
        listToRemove.add(makeObjects().get(0));
        listToRemove.add(makeObjects().get(1));
        System.out.println("Array before calling removeAll() method: \n" + dynArr);
        System.out.println("Boolean result of remove action: " + dynArr.removeAll(listToRemove));
        System.out.println("Array after calling removeAll() method: \n" + dynArr);
        System.out.println();
    }

    private static void callRemove(DynamicArray dynArr) {
        drawSeparator();
        System.out.println("Removed element when calling by index #0: \n" + dynArr.remove(0));
        System.out.println("Array after removing: \n" + dynArr);
        System.out.println();
    }

    private static void callIndexOf(DynamicArray dynArr) {
        drawSeparator();
        OuterObject existingObject = makeObjects().get(0);
        OuterObject nonExistingObject = new OuterObject(4444, existingObject.getArray(),
                existingObject.getInnerObject(), existingObject.getInnerObjects());
        System.out.println("Trying to get the index of existing element: " + dynArr.indexOf(existingObject));
        System.out.println("Trying to get the index of non existing element: " + dynArr.indexOf(nonExistingObject));
        System.out.println();
    }

    private static void callContainsAll(DynamicArray dynArr) {
        drawSeparator();
        System.out.println("Array: \n" + dynArr);
        ArrayList<OuterObject> listToBeVerified = makeObjects();
        System.out.println("List to be verified: \n" + listToBeVerified);
        System.out.println(dynArr.containsAll(listToBeVerified));
        System.out.println();

        listToBeVerified.get(0).setId(4444);
        ArrayList<OuterObject> newListToBeVerified = listToBeVerified;
        System.out.println("The case when just one element does not match.");
        System.out.println("List to be verified 2: \n" + newListToBeVerified);
        System.out.println(dynArr.containsAll(newListToBeVerified));
        System.out.println();
    }

    private static void callContains(DynamicArray dynArr) {
        drawSeparator();
        OuterObject existingObject = makeObjects().get(2);
        OuterObject nonExistingObject = new OuterObject(4444, existingObject.getArray(),
                existingObject.getInnerObject(), existingObject.getInnerObjects());
        System.out.println("Check if the array contains an existing object: " + dynArr.contains(existingObject));
        System.out.println("Check if the array contains a non existing object: " + dynArr.contains(nonExistingObject));
        System.out.println();
    }

    private static void callClone(DynamicArray dynArr) {
        drawSeparator();
        System.out.println("Original Array: \n" + dynArr);
        System.out.print("Cloned Array: \n");
        try {
            DynamicArray clonedArray = (DynamicArray) dynArr.clone();
            OuterObject clonedMember = (OuterObject) clonedArray.getArray()[0];
            Method[] methods = clonedMember.getClass().getMethods();
            System.out.println("Try to change members of the cloned array: ");
            for (Method method : methods) {
                changeClonedObject(clonedMember, method);
            }
            System.out.println(clonedArray);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void changeClonedObject(OuterObject clonedMember, Method method) {
        if (method.getName().equals("setInnerObject")) {
            clonedMember.setInnerObject(new InnerObject("changed", 5555));
        }
        if (method.getName().equals("setId")) {
            clonedMember.setId(5555);
        }
        if (method.getName().equals("getInnerObjects")) {
            InnerObject changed1 = new InnerObject("changed2", 5555);
            InnerObject changed2 = new InnerObject("changed3", 5555);

            clonedMember.getInnerObjects()[0] = changed1;
            clonedMember.getInnerObjects()[1] = changed2;
        }
        if (method.getName().equals("setArray")) {
            int[] newArray = {5555, 5555};
            clonedMember.setArray(newArray);
        }
    }

    private static void callClear(DynamicArray dynArr) {
        drawSeparator();
        System.out.println("Size before calling clear() method: " + dynArr.getSize());
        dynArr.clear();
        System.out.println("Array after calling clear() method: \n" + dynArr);
        System.out.println("Array's length is default 16");
        System.out.println("Size after calling clear() method: " + dynArr.getSize());
        System.out.println();
    }

    private static void callAddAll(DynamicArray dynArr) {
        drawSeparator();

        ArrayList<OuterObject> arrayList = makeObjects();

        dynArr.addAll(arrayList);
        System.out.println("Array after calling addAll method: \n" + dynArr);
        System.out.println();
    }

    private static ArrayList<OuterObject> makeObjects() {
        int[] intArray = {22, 33};
        InnerObject innerObject = new InnerObject("str", 1);
        InnerObject innerObject2 = new InnerObject("str2", 2);
        InnerObject innerObject3 = new InnerObject("str3", 3);
        InnerObject[] arrayOfObjects = {innerObject2, innerObject3};
        OuterObject outerObject3 = new OuterObject(3, intArray, innerObject, arrayOfObjects);
        OuterObject outerObject4 = new OuterObject(4, intArray, innerObject, arrayOfObjects);
        OuterObject outerObject5 = new OuterObject(5, intArray, innerObject, arrayOfObjects);
        OuterObject outerObject6 = new OuterObject(6, intArray, innerObject, arrayOfObjects);

        ArrayList<OuterObject> arrayList = new ArrayList<>();
        arrayList.add(outerObject6);
        arrayList.add(outerObject5);
        arrayList.add(outerObject3);
        arrayList.add(outerObject4);
        return arrayList;
    }

    private static OuterObject[] makeArrayToReplace() {
        int[] intArray = {222, 333};
        InnerObject innerObject = new InnerObject("replaced", 1);
        InnerObject innerObject2 = new InnerObject("replaced2", 2);
        InnerObject innerObject3 = new InnerObject("replaced3", 3);
        InnerObject[] arrayOfObjects = {innerObject2, innerObject3};

        OuterObject outerObject = new OuterObject(100, intArray, innerObject, arrayOfObjects);
        OuterObject outerObject2 = new OuterObject(200, intArray, innerObject, arrayOfObjects);
        OuterObject outerObject3 = new OuterObject(300, intArray, innerObject, arrayOfObjects);
        OuterObject outerObject4 = new OuterObject(400, intArray, innerObject, arrayOfObjects);

        OuterObject[] newArray = {outerObject, outerObject2, outerObject3, outerObject4};
        return newArray;
    }
}
