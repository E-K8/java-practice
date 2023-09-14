package collections.linked_list;

import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    //    Insert from head: push offerFirst addFirst
    //    Examine from head: peek peekFirst getFirst
    //    Remove from head: pop poll pollFirst removeFirst

    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Add elements at the head of the queue
        arrayDeque.push("book1");
        arrayDeque.offerFirst("book2");
        arrayDeque.addFirst("book3");
        arrayDeque.push("book4");
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

        String element4 = arrayDeque.pop();
        System.out.println(element4);
        System.out.println(arrayDeque);

        String element5 = arrayDeque.poll();
        System.out.println(element5);
        System.out.println(arrayDeque);

        String element6 = arrayDeque.pollFirst();
        System.out.println(element6);
        System.out.println(arrayDeque);

        String element7 = arrayDeque.removeFirst();
        System.out.println(element7);
        System.out.println(arrayDeque);
    }
}
