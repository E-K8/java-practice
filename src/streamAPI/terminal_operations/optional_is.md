**Optional** is a container object which may or may not contain a non-null value. **Optional** was introduced in Java 8 and is part of the **java.util** package. It's used as a better alternative to returning **null**, helping in writing more robust code by indicating that a value might be absent.

Here are some key points about Optional:

**Purpose**:

To help prevent **NullPointerException** in your code.
To clearly express a function's API, indicating when a returned value might not exist.

**Creation**:

**Optional.of(T value)**: Returns an Optional with the specified present non-null value.
**Optional.ofNullable(T value)**: Returns an Optional describing the specified value, if non-null; otherwise, returns an empty Optional.
**Optional.empty()**: Returns an empty Optional.

**Methods**:

**isPresent()**: Returns true if there is a value present, otherwise false.

**ifPresent(Consumer<? super T> consumer)**: If a value is present, invoke the specified consumer with the value; otherwise, do nothing.

**orElse(T other)**: Return the value if present; otherwise, return other.

**orElseGet(Supplier<? extends T> other)**: Return the value if present; otherwise, invoke other and return the result.

**orElseThrow()**: Return the contained value, if present, otherwise throw a NoSuchElementException.

**map(Function<? super T, ? extends U> mapper)**: If a value is present, apply the provided mapping function to it, and if the result is non-null, return an Optional describing the result.

**flatMap(Function<? super T, ? extends Optional\<U>> mapper)**: If a value is present, apply the provided Optional-bearing mapping function to it, return that result, otherwise return an empty Optional.

**Usage**:

    Optional<String> optional = Optional.of("Hello, world!");
    
    optional.ifPresent(System.out::println); // Prints "Hello, world!" if the value is present
    
    String value = optional.orElse("Default value"); // Returns the value if present, otherwise returns "Default value"

**Best Practices**:

Don't use **Optional** for class properties. It’s mainly designed for return types.

Don't call **Optional.get()** without first checking if a value is present using **isPresent()**, as it can throw **NoSuchElementException**.

Favor using methods like **orElse**, **orElseGet**, **ifPresent**, and map to work with the **Optional** values.

Don't use **Optional** for primitive data types. There are specialized versions like **OptionalInt**, **OptionalLong**, and **OptionalDouble**.

Using **Optional** can make your code clearer by explicitly handling the cases where a value might be absent, thereby reducing errors and making the code's intent more understandable.