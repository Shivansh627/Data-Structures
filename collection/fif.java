package collection;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class fif {
    public static void main(String[] args) {
        Queue <Integer> a= new PriorityQueue<>(Comparator.reverseOrder());

        a.offer(190);
        a.offer(2980);
        a.offer(40);
        a.offer(780);
        System.out.println(a);
        System.out.println(a.peek());

        a.poll();
        System.out.println(a);
    }
    
}
