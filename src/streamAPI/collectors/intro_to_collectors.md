In Java, the term "Collectors" most commonly refers to the **java.util.stream.Collectors** class that provides a set of utility methods to facilitate various operations with streams, especially in terms of collecting the results into different kinds of data structures.

When you're working with Java streams, often you'll want to process the elements in a stream and then gather them into a collection, like a **List**, **Set**, or **Map**. The Collectors class provides methods to achieve these operations.

Here are some of the most commonly used collectors:

**toList()**: Collects the elements of a stream into a List.

    List<String> list = stream.collect(Collectors.toList());

**toSet()**: Collects the elements of a stream into a Set.

    Set<String> set = stream.collect(Collectors.toSet());

**toMap()**: Collects the elements of a stream into a Map. Requires two functions: one to produce the key and one to produce the value.

    Map<Integer, String> map = stream.collect(Collectors.toMap(String::length, Function.identity()));

**joining()**: Concatenates the elements of a stream into a single String. Useful for String streams.

    String joined = stream.collect(Collectors.joining(", "));

**averagingInt(), averagingLong(), averagingDouble()**: Computes the average of stream elements.

    Double average = stream.collect(Collectors.averagingInt(Integer::valueOf));

**summingInt(), summingLong(), summingDouble()**: Computes the sum of stream elements.

    Integer sum = stream.collect(Collectors.summingInt(Integer::valueOf));

**groupingBy()**: Groups the elements of a stream by some classification function.
    
    Map<Integer, List<String>> groupedByLength = stream.collect(Collectors.groupingBy(String::length));

**partitioningBy()**: Partitions the elements of a stream based on a predicate.

    Map<Boolean, List<String>> partitioned = stream.collect(Collectors.partitioningBy(s -> s.length() > 5));

**counting()**: Counts the number of elements in a stream.

    Long count = stream.collect(Collectors.counting());

**reducing()**: Reduces the elements of a stream to a single value.

**Optional<String> concatenated = stream.collect(Collectors.reducing((s1, s2) -> s1 + s2));**

**maxBy() and minBy()**: Determines the maximum or minimum element of a stream based on a comparator.

    Optional<String> longest = stream.collect(Collectors.maxBy(Comparator.comparingInt(String::length)));

**collectingAndThen()**: Adapts a Collector to perform an additional finishing transformation.

    List<String> unmodifiableList = stream.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

These are just some of the methods provided by the **Collectors** class. The utility of this class is that it offers a plethora of methods to perform common, often complex, operations on streams in a concise and readable manner.