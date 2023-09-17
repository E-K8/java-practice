package collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {
    public static void main(String[] args) {
        Map<Integer, String> recruiters = new HashMap<>(Map.of(1, "Spencer", 2, "Kyle", 3, "Lily"));
        String name = recruiters.get(5);
        name = recruiters.getOrDefault(1, "no recruiter found here");
        System.out.println(("Name: " + name));
        System.out.println(recruiters);

        Set<Integer> myKeys = recruiters.keySet();
        myKeys.forEach(k -> System.out.println("Key: " + k));

        Collection<String> myValues = recruiters.values();
        myValues.forEach(v -> System.out.println("Value: " + v));

        for(Map.Entry<Integer, String> entry:recruiters.entrySet()){
            System.out.println("Key: " + entry.getKey() +", Value: " + entry.getValue() );
        }

        recruiters.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });

        recruiters.replace(1, "Robert");
        System.out.println(recruiters);

        recruiters.replaceAll((k,v)->v.toUpperCase());
        System.out.println(recruiters);

        recruiters.merge(1, "Iain", (oldValue, newValue)-> {
            System.out.println("The old value: " + oldValue);
            System.out.println("The new value: " + newValue);
            return newValue;
        });

        recruiters.remove(1);
        System.out.println(recruiters);

//        recruiters.clear();
        System.out.println(recruiters);
    }
}
