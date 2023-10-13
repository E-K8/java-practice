package streamAPI.terminal_operations;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    static List<Integer> intList = new ArrayList<>(List.of(1, 2, -3, 4, 5, 6, 7, 8, 9));

    HashMap<Integer, String> empMap = new HashMap<>(Map.of(1, "Kate", 2, "Sam"));

    String[] strArr = {"first", "second", "third"};

    public static void main(String[] args) {
        OptionalInt min = IntStream.of(1, 2, 3).min(); // can contain values, but they also can be omitted
        OptionalLong max = LongStream.of(1, 2, 3, 4).max();
        OptionalDouble avg = DoubleStream.of(1, 2, 3, 4).average();
        Optional<Integer> listMin = intList.stream().min(Comparator.naturalOrder());

        listMin.isEmpty();
        listMin.isPresent();
        listMin.get();
        listMin.orElse(0);

        Optional<String> optionalS1 = Optional.of("Kate");
        Optional<String> optionalS2 = Optional.ofNullable("Joe Black");
        System.out.println(optionalS1.get());
        System.out.println(optionalS2);
        System.out.println(optionalS2.orElse("empty string here"));

        int min1 = IntStream.of(1, 2, 3).min().orElse(0); // can contain values, but they also can be omitted
        long max1 = LongStream.of(1, 2, 3, 4).max().orElse(0);
        double avg1 = DoubleStream.of(1, 2, 3, 4).average().orElse(0);

        intList.stream().forEach(System.out::println);

        System.out.println(intList.stream().findAny());
        System.out.println(intList.parallelStream().findAny());
        System.out.println(intList.parallelStream().findFirst());
        System.out.println(intList.stream().allMatch(e-> e>0));
        System.out.println(intList.stream().anyMatch(e-> e<0));
        System.out.println(intList.stream().noneMatch(e-> e<0));
    }
}
