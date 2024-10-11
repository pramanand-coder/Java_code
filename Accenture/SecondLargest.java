public class SecondLargest {
    public static int secondLargest(int[] arr){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++){
          if(arr[i]>largest){
            slargest=largest;
            largest=arr[i];
          }
          else if(arr[i]<largest && arr[i]>slargest){
            slargest=arr[i];
          }
        }
        return slargest;
    }
    public static void main(String[] args){
        int[] arr={9,8,9,7,2,9,9,0};
        int ans=secondLargest(arr);
        System.out.println("second largest element:"+ans);
    }
}
