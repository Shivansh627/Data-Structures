package collection;
import java.util.HashSet;
import java.util.Set;

public class six {
    public static void main(String[] args) {
        Set <Integer> a=new HashSet<>();

        a.add(20);
        a.add(30);
        a.add(40);
        a.add(60);
        a.add(80);
        a.add(20);
        System.out.println(a);
        
        System.out.println(a.size());
        a.remove(30);
        System.out.println(a);

        boolean c=a.contains(50);
        System.out.println(c);

        System.out.println(a.size());
        a.clear();
        System.out.println(a);
    }
    
}
