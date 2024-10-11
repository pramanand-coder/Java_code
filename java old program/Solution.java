import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.  
        //Map<Integer, Integer> mpp = new HashMap<>();
        Map mpp=new HashMap();
        mpp.put(0,1);
        int cnt=0,preSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            preSum+=arr[i];
            int remove=preSum-s;
            cnt+=mpp.getOrDefault(remove,0);
            mpp.put(preSum,mpp.getOrDefault(remove,0)+1);  
        } 
        return cnt;
    }
public static void main(String[] args)
{
 int [] arr={1,2,3};
 int s=3;
 Solution obj=new Solution();
 int a=obj.findAllSubarraysWithGivenSum(arr,s);
 System.out.println(a);
}
}