package homework_18.shushanik_araqelyan;
import java.util.Set;
public class GenericMap<C,D> {
    private MyMap<C, D> map;

    public GenericMap() {
        map = new MyMap<>();
    }

    public void put(C key, D value) {
        map.put(key, value);
    }

    public C get(C key) {
        return map.get(key);
    }


    public void extend(MyMap<C, D> otherMap) {
        for (C key : otherMap.keySet()) {
            C value = otherMap.get(key);
            map.put(key, (D) value);
        }
    }
}

