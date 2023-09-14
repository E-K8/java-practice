package collections.linked_list.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    // poll, remove, peek, element
    public static void main(String[] args) {
        PriorityQueue<Customer> pq = new PriorityQueue<>(5, Comparator.comparingInt(Customer::id));

//        or if we want to compare strings, use this↓
//        PriorityQueue<Customer> pq = new PriorityQueue<>(5, Comparator.comparing(Customer::name));

        pq.add(new Customer(102, "Jane Eyre", 3));
        pq.add(new Customer(99, "Casper Jones", 1));
        pq.add(new Customer(101, "Haruko Murakami", 4));

//        poll will sort based on priority ↓
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());

//        peek or element will show the element (always the first in priority) without mutating the structure
//        System.out.println(pq.peek());

//        System.out.println(pq.element());

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
