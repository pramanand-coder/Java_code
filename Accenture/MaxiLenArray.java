public class MaxiLenArray {
    public static int MaxArray(int[] arr,int target){
       int max_len=0;
       for(int i=0;i<arr.length-1;i++){
        int sum1=arr[i];
        for(int j=i+1;j<arr.length;j++){
            sum1+=arr[j];
            if(sum1==target){
                max_len=Math.max(j-i+1,max_len);
            }
        }
       }
       return max_len;
    }
   public static void main(String[] args){
    int[] arr={2,3,4,1,1,-3,0,3,4};
    int target=3;
    int ans=MaxArray(arr,target);
    System.out.println("Maximum Length:"+ans);
   } 
}
