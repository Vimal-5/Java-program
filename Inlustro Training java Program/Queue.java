import java.util.*;
class Main {
    public static void main (String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        //it can be store all elements in the Queue
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        
        //print the queue elements
        System.out.println(q);
        
        //delete the first element and print
        System.out.println(q.poll());
        
        //print the first element without deleting
        System.out.println(q.peek());
        
        //print the sizeof the queue
        System.out.println(q.size());
        
        //it is presentn the queue or not
        System.out.println(q.contains(40));
        
        //the queue is empty or not
        System.out.println(q.isEmpty());
        
        //itis like poll() but the queueis empty it throws the exception
        System.out.println(q.remove());
        
        //it is like peek() same as above
        System.out.println(q.element());
        
        //delete all elements inthe queue
        q.clear();
        System.out.println(q);
    }
}