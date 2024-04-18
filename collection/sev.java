package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class sev {
    public static void main(String[] args) {
        Set <Integer> a= new  LinkedHashSet<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(a);
        System.out.println(a.size());
        
        a.remove(30);
        System.out.println(a);

        boolean e=a.contains(40);
        System.out.println(e);

        a.clear();
        System.out.println(a);


    }
    
}
