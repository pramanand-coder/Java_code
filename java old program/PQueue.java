import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Arrays;
public class PQueue 
{
    public static void main(String[] args){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(6);
        p.add(1);
        p.add(2);
        p.add(4);
        //p.add(7);
        Object[] arr=p.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(p.peek());
        int p1=p.poll();
        System.out.println(p1);
        System.out.println(p.peek());

    }
}
