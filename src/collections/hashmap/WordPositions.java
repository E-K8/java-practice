package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPositions {
    //    "Tell me why why why oh whyaiaia" -> {Tell: [0], me: [1], why: [2,3,4], oh: [5], whyaiaia[6] }
    public static void main(String[] args) {
        String sentence = "Tell me why why why oh whyaiaia";
        String[] words = sentence.split(" ");
        System.out.println(words);
        Map<String, List<Integer>> indices = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (indices.containsKey(word)) {
                List<Integer> currList = indices.get(word);
                currList.add(i);
            } else {
                indices.put(word, new ArrayList<>(List.of(i)));
            }
        }
        System.out.println(indices);
    }
}
