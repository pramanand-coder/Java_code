import java.util.*;
public class RepeatingNumber {
    public static List<Integer> repeatingNumber(int[] arr){
       int n=arr.length;
       List<Integer> res=new ArrayList<>();
       for(int i=0;i<n;i++){
        int index=arr[i]%n;
        arr[index]+=n;
       }
       System.out.println(Arrays.toString(arr));
       for(int i=0;i<n;i++){
        if(arr[i]/n >=2){
            res.add(i);
        }
       }
       return res;
    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 6, 3, 6, 1};
        List<Integer> ans=repeatingNumber(arr);
        System.out.println(ans);
    }
}
