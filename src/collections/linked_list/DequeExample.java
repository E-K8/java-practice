package collections.linked_list;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

//    12 methods for adding and removing elements from the beginning and end of deques:
//    offerFirst offerLast || pollFirst pollLast || peekFirst peekLast
//    addFirst addLast || removeFirst removeLast || getFirst getLast

    public static void main(String[] args) {
        Deque<String> linkedList = new LinkedList<>();
        linkedList.push("book1");
        linkedList.push("book2");
        linkedList.push("book3"); // pushes elements to the front of the queue
        System.out.println(linkedList);

        String poppedElement = linkedList.pop(); // remove the first element
        System.out.println(poppedElement); // display the removed element
        System.out.println(linkedList);

        linkedList.addFirst("first");
        System.out.println(linkedList);
        linkedList.addLast("last");
        System.out.println(linkedList);

        linkedList.pollFirst();
        System.out.println(linkedList);
        linkedList.pollLast();
        System.out.println(linkedList);
    }
}
