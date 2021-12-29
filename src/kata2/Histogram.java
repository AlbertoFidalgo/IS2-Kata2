package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;
   
    public Histogram(T[] data){
        this.data=data;
    }

    public T[] getData() {
        return data;
    }
   
    public Map getHistogram(){
        Map<T, Integer> hashmap = new HashMap();
        for (T i : data) {
            hashmap.put(i, hashmap.containsKey(i) ? hashmap.get(i)+1 : 1);
        }
        return hashmap;
    }
   
}