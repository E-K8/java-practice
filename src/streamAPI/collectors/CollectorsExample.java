package streamAPI.collectors;

import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Smug", "Kate", "is", "a", "successful", "software", "engineer."));
        String joinedString = list1.stream().collect(Collectors.joining(" ", ">>>", "<<<"));
        System.out.println(joinedString);

        Map<String, Integer> map = list1.stream().collect(Collectors.toMap(s1 -> s1, s1 -> s1.length()));
        System.out.println(map);

        List<Integer> list2 = Stream.of(1, 2, 3).collect(Collectors.toUnmodifiableList());

        Map<Integer, Set<String>> collect = list1.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(collect);

        Map<Boolean, List<String>> partitioned = list1.stream().collect(Collectors.partitioningBy(s -> s.contains("a")));
        System.out.println(partitioned);
    }
}
