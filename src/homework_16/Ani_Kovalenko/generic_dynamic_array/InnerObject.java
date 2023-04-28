package homework_16.Ani_Kovalenko.generic_dynamic_array;

public class InnerObject implements Cloneable {
    private String str;
    private Integer integer;

    InnerObject(String str, Integer integer) {
        this.integer = integer;
        this.str = str;
    }

    InnerObject(InnerObject innerObject) {
        this.integer = innerObject.integer;
        this.str = innerObject.str;
    }

    public Integer getInteger() {
        return integer;
    }

    public String getStr() {
        return str;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "{" +
                "str='" + str + '\'' +
                ", integer=" + integer +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
