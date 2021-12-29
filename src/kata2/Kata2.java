package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
       
        String[] array = {"Pepe", "Maria", "Pepe", "Pepe", "Maria", "Alberto", "Samuel"};
        System.out.println(Arrays.toString(array));
       
        Histogram histogram = new Histogram(array);
        Map<String, Integer> map = histogram.getHistogram();
        for (String key : map.keySet()) {
        System.out.println("Key = " + key + "   Value = " + map.get(key));
        }
    }
}