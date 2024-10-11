import java.util.*;
public class SubarraySum {
    public static ArrayList<Integer> subarrayIndex(int[] arr,int s){
        ArrayList<Integer> ans=new ArrayList<>();
        int sum1=0;
        int i=0,j=1;
        sum1=arr[i]+arr[j];
        while(j<arr.length){
            if(sum1==s){
                ans.add(i+1);
                ans.add(j+1);
                return ans;
            }
            else if(sum1<s){
                j+=1;
                sum1+=arr[j];
            }
            else{
                sum1-=arr[i];
                i+=1;
            }
        }
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,7};
        int s=12;
        ArrayList<Integer> res=subarrayIndex(arr,s);
        System.out.println(res);
    }
}
