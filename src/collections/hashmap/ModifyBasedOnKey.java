package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ModifyBasedOnKey {
    //    adding/updating entry to map entry set
    //    put, putAll, putIfAbsent, computeIfAbsent, computeIfPresent, compute
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"John");
        students.put(2,"Steven");
//        students.put(2,"Joanna McKenzie"); // put() both puts and updates
        System.out.println(students);

        Map<Integer, String> anotherMap = new HashMap<>(Map.of(3, "Graham", 4, "Lizzy"));
        System.out.println(anotherMap);

        students.putAll(anotherMap); // putAll also will update the value if the same key is used
        System.out.println(students);

        students.putIfAbsent(5,"Doug");
        System.out.println(students);

        students.computeIfAbsent(6,k-> {
            System.out.println(k);
            return"Peter";
        });
        System.out.println(students);

//        computerIfPresent is used only to update a record or entry
        students.computeIfPresent(3,(k,v)-> v.toUpperCase()+"!!!");
        System.out.println(students);

        students.compute(7,(k,v)-> {
            if(students.containsKey(k)) {
                return v.toUpperCase()+"**";
            }
            return "Unknown";
        });
        System.out.println(students);
    }
}
