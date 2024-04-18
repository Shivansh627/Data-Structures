package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ele {
    public static void main(String[] args) {
        List <Integer> a= new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        ListIterator<Integer> b=a.listIterator();
        while (b.hasNext()) {
            System.out.println(b.next());
            
        }
        System.out.println("_______________________________________________________");
        while (b.hasPrevious()) {
            System.out.println(b.previous());
            
        }
        
    }
    
}
