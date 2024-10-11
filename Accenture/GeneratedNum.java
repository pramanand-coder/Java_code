import java.util.*;
public class GeneratedNum {
    public static int Count(int n,int a1,int a2){
        int[] arr={a1,a2};
        Set<Integer> set=new HashSet<>();
        Queue<Integer> qu=new LinkedList<>();
        set.add(n);
        qu.add(n);
        while(qu.size()>0){
            int current=qu.poll();
            for(int a:arr){
                int nextNum=current-a;
                if(nextNum>0 && !set.contains(nextNum)){
                    qu.add(nextNum);
                    set.add(nextNum);*
                }
            }
        }
        return set.size();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1=1,a2=2;
        System.out.println(Count(n,a1,a2));
    }
}
