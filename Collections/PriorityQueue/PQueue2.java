import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;
public class PQueue2{
   public static void main(String[] args){
    PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());    //max-heap
    p.add(1);
    p.add(6);
    p.add(8);
    p.add(2);
    Object[] arr=p.toArray();
    System.out.println(Arrays.toString(arr));
    while(!p.isEmpty()){
        System.out.print(p.poll()+" ");
    }
   } 
}
