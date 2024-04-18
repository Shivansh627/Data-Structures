package collection;

import java.util.HashMap;
import java.util.Map;

public class nin {
    public static void main(String[] args) {
        Map <Integer,String> a=new HashMap<>();

        a.put(1,"Shivansh");
        a.put(2,"Shukla");
        a.put(4,"Shiv");
        a.put(5,"ansh");
        a.put(6,"Shiva");
        System.out.println(a);
        
        a.putIfAbsent(3,"ANd");
        a.putIfAbsent(4,"Or");
        System.out.println(a);
        System.out.println(a.isEmpty());
        
        a.remove(4);
        
        System.out.println(a);
    }
    
}
