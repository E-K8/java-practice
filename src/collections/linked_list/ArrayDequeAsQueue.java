package collections.linked_list;

import java.util.ArrayDeque;

public class ArrayDequeAsQueue {
    //    Insertion from tail: offer offerLast addLast
    //    Examine from head: peek peekFirst getFirst
    //    Remove from head:  poll pollFirst removeFirst
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        // Add elements at the end of the queue
        arrayDeque.offer("customer1");
        arrayDeque.offerLast("customer2");
        arrayDeque.addLast("customer3");
        arrayDeque.offer("customer4");
        System.out.println(arrayDeque);

        // Show what's at the head, doesn't mutate the structure ↓
        String element1 = arrayDeque.peek();
        System.out.println(element1);
        System.out.println(arrayDeque);

        String element2 = arrayDeque.peekFirst();
        System.out.println(element2);
        System.out.println(arrayDeque);

        String element3 = arrayDeque.getFirst();
        System.out.println(element3);
        System.out.println(arrayDeque);

        // Remove from head

        String element4 = arrayDeque.poll();
        System.out.println(element4);
        System.out.println(arrayDeque);

        String element5 = arrayDeque.pollFirst();
        System.out.println(element5);
        System.out.println(arrayDeque);

        String element6 = arrayDeque.removeFirst();
        System.out.println(element6);
        System.out.println(arrayDeque);
    }
}
