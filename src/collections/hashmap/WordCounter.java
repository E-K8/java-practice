package collections.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    /*
    Count repeated words in a string
    "Hello Java" -> {Hello: 1, Java: 1}
    "Say ho ho ho" -> {Say: 1, ho: 3}
    */

    public static void main(String[] arg) {
        String sentence = "Say ho ho ho junior programmer";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
//            counts.put(word, counts.getOrDefault(word, 0) + 1);
            counts.merge(word, 1, (oldValue, newValue)->oldValue+newValue);
//            counts.merge(word, 1, Integer::sum); // the same as above ↑
        }
        System.out.println(counts);
    }
}
