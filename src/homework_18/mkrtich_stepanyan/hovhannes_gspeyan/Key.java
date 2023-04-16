package homework_18.mkrtich_stepanyan.hovhannes_gspeyan;

public class Key <T>{

    private T value;

    public Key(T value) {
        this.value = value;
    }

    public Key() {
    }

    public T of(T value){
        return  this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(! (obj instanceof Key)){
            return false;
        }
        return this.value.equals(((Key<?>) obj).value);
    }

    @Override
    public int hashCode() {
        int hashCode = this.value.hashCode();
        hashCode = hashCode * 31 + (this.value == null ? 0 : this.value.hashCode());
        return hashCode;
    }
}
