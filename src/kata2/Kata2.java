package kata2;

import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
       
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
             array[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(array));
       
        Histogram histogram = new Histogram(array);
        Map<Integer, Integer> map = histogram.getHistogram();
        for (Integer key : map.keySet()) {
        System.out.println("Key = " + key + "   Value = " + map.get(key));
        }
    }
}