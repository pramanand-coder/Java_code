public class ReverseArray {
    public static int reverseArray(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int sum1=0;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            if(i%2==0){
                sum1+=arr[i];
            }
            i++;
            j--;
        }
        for(j=i;j<n;j++){
            if(j%2==0){
                sum1+=arr[j];
            }
        }
        return sum1;

    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60};
        int[] arr2={21,24,67,13,24,27};
        int ans=reverseArray(arr2);
        System.out.println("Sum="+ans);
    }
}
