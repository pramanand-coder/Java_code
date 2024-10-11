public class BinarySearch {
    public static int BS(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;

            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[]={34,56,78,90,777,778,888};
        int target=888;
        System.out.println(target+" is found at position "+BS(a,target));
    }
}
