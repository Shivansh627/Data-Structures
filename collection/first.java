package collection;
import java.util.ArrayList;
import java.util.List;

public class first {
    public static void main(String[] args) {
        List <Integer> a= new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);
        a.remove(4);
        System.out.println(a);
        int b=a.get(2);
        System.out.println(b);
        a.set(3,80);
        boolean c=a.contains(45);
        System.out.println(c);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
    
}
