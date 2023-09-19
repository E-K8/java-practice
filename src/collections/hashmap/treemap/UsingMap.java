package collections.hashmap.treemap;

import java.util.Map;
import java.util.TreeMap;

public class UsingMap {
    public static void main(String[] args) {
        Map<Integer,String> tree = new TreeMap<>();
        tree.put(1, "a");
        tree.put(3, "d");
        tree.put(4, "z");
        tree.put(2, "e");
        System.out.println(tree);


        tree.putAll(Map.of(1, "one", 2,"two"));
        tree.putIfAbsent(1, "one");
        tree.computeIfAbsent(1,k->"one");
        tree.computeIfPresent(2, (k,v)->v.toUpperCase());
        tree.compute(1, (k,v)-> v.toUpperCase());
        tree.merge(1, "newValue", (oldValue, newValue)-> newValue);

        tree.get(1);
        tree.getOrDefault(0, "no-such-element");

        tree.remove(1);
        tree.replace(1, "AA");
        tree.replaceAll((k,v)-> v.toUpperCase());

        tree.containsKey(1);
        tree.containsValue("d");
        tree.isEmpty();
        tree.clear();
    }
}
