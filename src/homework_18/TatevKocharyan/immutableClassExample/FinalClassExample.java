package homework_18.TatevKocharyan.immutableClassExample;

import java.util.HashMap;
import java.util.Iterator;

public class FinalClassExample {
    private final int id;

    private final String name;

    private final HashMap<String, String> testMap;

    public FinalClassExample(int id, String name, HashMap<String, String> testMap1) {
        this.id = id;
        this.name = name;

        HashMap<String, String> tempMap = new HashMap<String, String>();
        String key;
        Iterator<String> it=testMap1.keySet().iterator();
        while (it.hasNext()){
            key=it.next();
            tempMap.put(key,testMap1.get(key));
        }
        this.testMap = tempMap;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

}
