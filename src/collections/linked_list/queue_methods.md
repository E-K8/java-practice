In Java's `Queue` interface, there are methods that are used to manipulate and inquire about the elements of the queue. Specifically, there are two sets of methods for these purposes, and they differ in how they handle certain situations:

`add()`, `remove()`, and `element()`
`offer()`, `poll()`, and `peek()`

Here's a breakdown of the differences:

1. **add(), remove(), and element()**
   `add(E e)`:
   Inserts the specified element into the queue.
   If the element cannot be added (due to capacity restrictions, for example in a bounded queue), it throws an `IllegalStateException`.
2. 
   `remove()`:
   Retrieves and removes the head of the queue.
   If the queue is empty, it throws a `NoSuchElementException`.
   element():
   Retrieves, but does not remove, the head of the queue.
   If the queue is empty, it throws a `NoSuchElementException`.
3. 
2. **offer(), poll(), and peek()**
   `offer(E e)`:
   Inserts the specified element into the queue.
   If the element cannot be added (due to capacity restrictions, for example in a bounded queue), it returns false (instead of throwing an exception).
   `poll()`:
   Retrieves and removes the head of the queue.
   If the queue is empty, it returns null (instead of throwing an exception).
   `peek()`:
   Retrieves, but does not remove, the head of the queue.
   If the queue is empty, it returns null (instead of throwing an exception).

3. **When to Use Which?**
   If you're confident that the queue operations will always succeed (for example, you're sure that the queue will never be full or empty when you call the respective methods), you might prefer `add()`, `remove()`, and `element()`.

If you want a more graceful way to handle potential failures (like when a queue might become full or empty), then `offer()`, `poll()`, and `peek()` would be more suitable since they won't throw exceptions in these scenarios.

For many real-world applications, especially when the capacity or the state of the queue isn't always predictable, the latter set of methods (`offer()`, `poll()`, and `peek()`) is often preferred because it provides a safer and more intuitive way to deal with these scenarios.