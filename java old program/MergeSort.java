import java.util.*;
public class MergeSort {
    public static void merge(int[] arr,int low,int mid,int high){
        int left=low,right=mid+1,i=0;
        int[] temp=new int[high-low+1];
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[i++]=arr[left];
                left++;
            }
            else{
                temp[i++]=arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[i++]=arr[left];
            left++;
        }
        while(right<=high){
            temp[i++]=arr[right];
            right++;
        }
        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return ;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the "+i+" element:");
        arr[i]=sc.nextInt();
    }
    System.out.println("Before Sorting Array is :"+Arrays.toString(arr));
    mergeSort(arr,0,arr.length-1);
    System.out.println("After Sorting array is "+Arrays.toString(arr));
   } 
}
