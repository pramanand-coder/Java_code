import java.util.*;
public class GeneratedNumber {
    public static int Count(int num,int a1,int b){
        int[] arr={a1,b};
        Set<Integer> set=new HashSet<>();
        Queue<Integer> qu=new LinkedList<>();
        qu.add(num);
        set.add(num);
        while(qu.size()>0){
            int current=qu.poll();
            for(int a:arr){
                int nextNumber=current-a;
                if(nextNumber>0 && !set.contains(nextNumber) ){
                    qu.add(nextNumber);
                    set.add(nextNumber);
                }
            }

        }
        return set.size();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        System.out.println("Count="+Count(num,a1,a2));
    }
}
