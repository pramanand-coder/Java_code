public class SecondLargestElement {
    public static void print2largest(int[] arr,int n){
        if(n<2){
            System.out.println("Invalid input");
            return ;
        }
        int first,second;
        first=arr[0];
        second=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]<first){
                second=arr[i];
            }
        }
        System.out.println("Second Largest="+second);
    }
    public static void main(String...args){
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
