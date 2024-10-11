import java.util.*;
import java.util.LinkedList;
public class Queue1{
    public static void main(String[] args){
        Queue<Integer> s=new LinkedList<>();
        s.add(5);
        s.add(10);
        s.add(15);
        s.add(20);
        System.out.println(s);
        int a=s.remove();
        System.out.println("removed:"+a);
        System.out.println(s);
        s.poll();
        System.out.println(s);
        s.add(56);
        System.out.println(s);
        System.out.println("peek"+s.peek());
        s.remove(15);
        System.out.println(s);
        
    }
}