package collections.linked_list.priority_queue;

import java.util.PriorityQueue;

public class Main {
    //    retrieval: poll, remove, peek, element
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue();
        numbers.add(45);
        numbers.add(12);
        numbers.add(23);
        numbers.add(34);

//        will remove elements in natural order ↓
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());

        PriorityQueue<String> letters = new PriorityQueue<>();
        letters.add("f");
        letters.add("c");
        letters.add("n");
        System.out.println(letters.poll());
        System.out.println(letters.poll());
        System.out.println(letters.poll());
    }
}
