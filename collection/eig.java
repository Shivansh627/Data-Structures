package collection;

import java.util.TreeSet;
import java.util.Set;

public class eig {
    public static void main(String[] args) {
        Set <Integer> a=new TreeSet<>();

        a.add(34);
        a.add(3);
        a.add(4);
        a.add(934);
        a.add(349);
        System.out.println(a);
        System.out.println(a.size());
        
        a.remove(34);
        System.out.println(a);
        System.out.println(a.contains(34));

        a.clear();
        System.out.println(a);
    }    
}
