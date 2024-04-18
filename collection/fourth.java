package collection;

import java.util.LinkedList;
import java.util.Queue;
public class fourth {
    public static void main(String[] args) {
        Queue <Integer> a=new LinkedList<>();
        a.offer(10);
        a.offer(100);
        a.offer(60);
        a.offer(76);
        a.offer(908);

        System.out.println(a);

        System.out.println(a.peek());

        a.poll();
        a.poll();

        System.out.println(a);
    }
}
