import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;
public class PQueue3{
   public static void main(String[] args){
    PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->b-a);    //max-heap
    System.out.println(p.add(1));
   System.out.println(p.offer(6));
    p.add(8);
    p.add(2);
    Object[] arr=p.toArray();
    System.out.println(Arrays.toString(arr));
    while(!p.isEmpty()){
        System.out.print(p.poll()+" ");
    }
   } 
}
