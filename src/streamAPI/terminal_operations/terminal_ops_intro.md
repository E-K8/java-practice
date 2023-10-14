In the Java Stream API, terminal operations are those operations that produce a result or a side effect and terminate the stream processing pipeline. Once a terminal operation is invoked on a stream, the stream can no longer be used for further operations. Here are some of the most common terminal operations:

**forEach(Consumer action)**:

This operation performs an action for each element in the stream.
It's a void operation, meaning it doesn’t return anything.

    Stream.of("a", "b", "c").forEach(System.out::print);  // Outputs: abc

**toArray()**:

Converts the stream elements into an array.

    Integer[] arr = Stream.of(1, 2, 3).toArray(Integer[]::new);  // [1, 2, 3]

**reduce(BinaryOperator accumulator)**:

Performs a reduction on the stream elements using a given function and returns an Optional.
It can be used to aggregate stream elements into a single value.

    Optional<Integer> sum = Stream.of(1, 2, 3).reduce(Integer::sum);  // Optional[6]

**collect(Collector collector)**:

This is a mutable reduction operation. It collects the stream elements into a result container like a List, Set, or Map.

    List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());  // [a, b, c]

**min(Comparator comparator) and max(Comparator comparator)**:

Returns the minimum or maximum element of the stream according to a given comparator, wrapped in an Optional.

    Optional<Integer> min = Stream.of(1, 2, 3).min(Comparator.naturalOrder());  // Optional[1]

**count()**:

Returns the count of elements in the stream.

    long count = Stream.of(1, 2, 3).count();  // 3

**anyMatch(Predicate predicate), allMatch(Predicate predicate), and noneMatch(Predicate predicate)**:

These operations are short-circuiting and used to test the elements of the stream against a predicate.

    boolean anyEven = Stream.of(1, 2, 3).anyMatch(n -> n % 2 == 0);  // true

**findFirst() and findAny()**:

These operations return an Optional describing some element of the stream.
While both can be used in any stream, findAny is particularly useful in parallel streams where you might not care about the order.


    Optional<String> first = Stream.of("a", "b", "c").findFirst();  // Optional[a]

**iterator()**:

Returns an iterator for the elements of the stream.

    Iterator<Integer> iterator = Stream.of(1, 2, 3).iterator();
Remember, once you perform a terminal operation on a stream, that stream is considered "consumed" and cannot be used again. If you try to use it, you'll get an **IllegalStateException**. If you need to perform multiple operations on the same set of data, you'll need to create a new stream each time.