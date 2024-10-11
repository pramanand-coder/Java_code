import java.util.Arrays;
import java.util.PriorityQueue;
public class PQueue1{
    public static void main(String[] args){
    PriorityQueue<Integer> p=new PriorityQueue<>();
    p.add(6);
    p.add(1);
    p.add(2);
    p.add(4);
    Object[] arr=p.toArray();
    System.out.println(Arrays.toString(arr));
    while(!p.isEmpty()){
        System.out.print(p.poll()+" ");
    }
    }
}