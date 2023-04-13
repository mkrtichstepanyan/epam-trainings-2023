package homework_16.Ani_Kovalenko.generic_dynamic_array;

import java.util.Arrays;

public class OuterObject implements Cloneable, Comparable {

    private int[] array;
    private int id;

    private InnerObject[] innerObjects;
    private InnerObject innerObject;

    OuterObject(int id, int[] array, InnerObject innerObject, InnerObject[] innerObjects) {
        this.id = id;
        this.array = array;
        this.innerObject = innerObject;
        this.innerObjects = innerObjects;
    }

    OuterObject(int id, OuterObject outerObject) {
        this.id = outerObject.id;
        this.array = outerObject.array;
        this.innerObject = outerObject.innerObject;
        this.innerObjects = outerObject.innerObjects;
    }

    private int[] copyArray() {
        int[] newArr = new int[this.array.length];
        System.arraycopy(array, 0, newArr, 0, array.length);
        return newArr;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    private InnerObject[] copyInnerObject() throws CloneNotSupportedException {
        InnerObject[] newArr = new InnerObject[this.innerObjects.length];
        for (int i = 0; i < this.innerObjects.length; i++) {
            newArr[i] = (InnerObject) this.innerObjects[i].clone();
        }
        return newArr;
    }

    public InnerObject[] getInnerObjects() {
        return innerObjects;
    }

    public void setInnerObjects(InnerObject[] innerObjects) {
        this.innerObjects = innerObjects;
    }

    public InnerObject getInnerObject() {
        return innerObject;
    }

    public void setInnerObject(InnerObject innerObject) {
        this.innerObject = innerObject;
    }

    @Override
    public String toString() {
        return "OuterObject{" + "id " + getId() +
                ", Array=" + Arrays.toString(array) +
                ", Array of InnerObjects=" + Arrays.toString(innerObjects) +
                ", Single InnerObject=" + innerObject +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        OuterObject outerObject = (OuterObject) o;
        if (this.id == outerObject.id) {
            return 0;
        } else if (this.id > outerObject.id) {
            return 1;
        }
        return -1;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        OuterObject clonedObject = (OuterObject) super.clone();
        clonedObject.setArray(copyArray());
        clonedObject.setInnerObject((InnerObject) this.getInnerObject().clone());
        clonedObject.setInnerObjects(copyInnerObject());
        return clonedObject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
