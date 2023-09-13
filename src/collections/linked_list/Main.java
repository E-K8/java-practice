package collections.linked_list;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    //    offer, poll, peek (don't throw exceptions)
    public static void main(String[] args) {
        Queue<String> linkedList1 = new LinkedList<>();
        linkedList1.offer("A");
        linkedList1.offer("B");
        linkedList1.offer("C");
        linkedList1.offer("D");

//        String element = linkedList.poll(); // gets the head of the element, mutates the structure
//        System.out.println(element);

        String el = linkedList1.peek(); // gets the head of the element, doesn't mutate the structure
        System.out.println(el);

        System.out.println(linkedList1);

        // add, remove, element // throw exceptions

        LinkedList<String> linkedList2 = new LinkedList<>();
//        linkedList2.remove(); // will throw an exception as there are no elements in linkedList2
        linkedList2.poll();
//        linkedList2.element(); // will throw an exception as there are no elements in linkedList2
        linkedList2.peek();
        System.out.println(linkedList2);
    }
}
