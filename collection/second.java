package collection;

import java.util.Stack;
public class second {
    public static void main(String[] args) {
        Stack<Integer> a=new Stack<Integer>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);

        System.out.println(a);
        int s= a.search(30);
        System.out.println(s);
        
        System.out.println(a);
        
        a.pop();
        System.out.println(a.peek());
    }
}
