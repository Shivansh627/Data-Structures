package collection;
import java.util.LinkedList;

public class third {
    public static void main(String[] args) {
        LinkedList<Integer> a= new LinkedList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(a);
        
        a.remove(3);
        System.out.println(a);
        
        System.out.println(a.get(3));

        a.set(2,89);
        System.out.println(a);
        
        boolean c=a.contains(50);
        System.out.println(c);
        
        a.clear();
        System.out.println(a);
        
    }
    
}
