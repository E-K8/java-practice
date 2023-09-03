### What Are Generics in Java?
Generics are a feature in Java that allow you to define classes, interfaces, and methods in which the type of the data operated upon is specified as a parameter. Introduced in Java 5 (JDK 1.5), generics improve type safety, code reusability, and readability.

Here's a simple example that illustrates how you can define a generic class:

    public class Box<T> {
    private T item;
    
        public Box(T item) {
            this.item = item;
        }
    
        public T getItem() {
            return item;
        }
    
        public void setItem(T item) {
            this.item = item;
        }
    }

In this example, `T` is a type parameter that will be replaced by a real type when an object of `Box` is created:


    Box<String> stringBox = new Box<>("Hello, World!");
    Box<Integer> integerBox = new Box<>(123);

### Why Do We Need Generics?
**Type Safety**: Before generics, you could insert any type of object into collections like `ArrayList`, `HashMap`, etc. This lack of type restrictions could lead to runtime errors. With generics, you can specify the type of elements beforehand, catching type-mismatch errors at compile-time rather than at runtime.

**Without Generics**:


**With Generics**:

    List<String> list = new ArrayList<>();
    list.add("hello");
    list.add(42);  // Compile-time error

**Code Reusability**: Generics enable you to write generalized and reusable code while still being type safe. The Box class example given above can be used for any types, not just String or Integer.

**Readability**: Generics improve code readability by making it evident what kind of types a class or method is operating on. This self-documenting feature can make code easier to understand.

**Elimination of Type Casting**: Before generics, you needed to cast objects when retrieving them from a collection. With generics, the casting is done automatically.

**Without Generics**:

    List list = new ArrayList();
    list.add("hello");
    String s = (String) list.get(0);  // Need to cast

**With Generics**:

    List<String> list = new ArrayList<>();
    list.add("hello");
    String s = list.get(0);  // No need to cast

**Algorithm Reuse**: Generic algorithms (like sorting, filtering, etc.) can be implemented once and used for different types, as long as they adhere to certain constraints (like implementing `Comparable` for sorting).

**Limitations**
**Type Erasure**: Generics in Java are implemented via type erasure, which removes the type information at runtime. As a result, you cannot use **instanceof** with a generic type or create an array of a generic type.

**Backward Compatibility**: Since generics were introduced in Java 5, using them may make your code incompatible with earlier versions of Java.

**Verbosity**: Generics can sometimes make the code verbose, especially when using complex nested types.

Despite these limitations, the benefits of using generics usually outweigh the drawbacks, making them a valuable feature for Java developers.