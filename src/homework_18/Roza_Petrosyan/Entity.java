package homework_18.Roza_Petrosyan;

import java.util.Objects;

public class Entity<T, E> {
    private T key;
    private E value;

    public Entity(T key, E value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity<?, ?> entity = (Entity<?, ?>) o;
        return Objects.equals(key, entity.key) && Objects.equals(value, entity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "{" + key + "=" + value + "}";
    }
}
