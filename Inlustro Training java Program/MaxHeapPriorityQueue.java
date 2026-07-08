import java.util.*;
class Main {
    public static void main (String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        //it can be store all elements in the Queue
        q.offer(10);
        q.offer(70);
        q.offer(60);
        q.offer(20);
        q.offer(50);
        
        //print the queue elements
        System.out.println(q);
    }
}