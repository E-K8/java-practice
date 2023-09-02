In Java, method references and lambdas are both used to represent instances of functional interfaces. They are a way to make your code more concise and potentially more readable. Before diving into method references, let's briefly review lambdas.

### Lambda Expressions
A lambda expression is an anonymous function (a function without a name) that you can use to create instances of functional interfaces. A functional interface is an interface that has just one abstract method, although it can have multiple default or static methods. Here's a quick example using Java's Runnable functional interface:

    Runnable run = () -> System.out.println("Hello, World!");

Here, `() -> System.out.println("Hello, World!") `is a lambda expression that represents an instance of a Runnable.

### Method References
Sometimes, a lambda expression does nothing but call an existing method. In those cases, instead of writing a lambda expression to call a method, you can use a method reference.

Here are four kinds of method references:

**Static Method References**: Reference to a static method.

    // Using lambda
    Function<Integer, String> lambdaFunction = (x) -> String.valueOf(x);
    // Using method reference
    Function<Integer, String> methodRefFunction = String::valueOf;

**Instance Method References of a Particular Object**: Reference to an instance method of a particular object.

    // Using lambda
    String prefix = "Hello, ";
    Function<String, String> lambdaFunction = (x) -> prefix.concat(x);
    // Using method reference
    Function<String, String> methodRefFunction = prefix::concat;

**Instance Method References of an Arbitrary Object**: Reference to an instance method of an arbitrary object of a particular type.

    // Using lambda
    Predicate<String> lambdaPredicate = (x) -> x.isEmpty();
    // Using method reference
    Predicate<String> methodRefPredicate = String::isEmpty;

**Constructor References**: Reference to a constructor.

    // Using lambda
    Supplier<List<String>> lambdaSupplier = () -> new ArrayList<>();
    // Using method reference
    Supplier<List<String>> methodRefSupplier = ArrayList::new;

Using method references can make your code more readable, but they are not always shorter than lambdas. The general rule is that you can use a method reference in place of a lambda if the lambda expression is invoking a single method and not doing anything else.