import java.util.*;

public class Queue_Interface {
    
    public static void main(String[] args) {
        // Deque<Integer> queue = new ArrayDeque<>();

        // // Single ended queue
        // queue.add(1);    //throw exception if fail
        // queue.offer(2);   // false if not add
        // queue.offer(3);

        // System.out.println(queue.peek()); //return null if not element
        // System.out.println(queue.element()); //can throw exception

        // //remove element
        // System.out.println(queue.remove()); //throw exception
        //System.out.println(queue.poll());

        //---------Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(2);
        pq.offer(20);
        pq.offer(40);
        pq.offer(30);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);

        pq2.offer(10);
        pq2.offer(2);
        pq2.offer(20);
        pq2.offer(40);
        pq2.offer(30);

        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());







    }
}
