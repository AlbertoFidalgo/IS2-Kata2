package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;
   
    public Histogram(int[] data){
        this.data=data;
    }

    public int[] getData() {
        return data;
    }
   
    public Map getHistogram(){
        Map<Integer, Integer> hashmap = new HashMap();
        for (int i : data) {
            hashmap.put(i, hashmap.containsKey(i) ? hashmap.get(i)+1 : 1);
        }
        return hashmap;
    }
   
}