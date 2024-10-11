public class MissingValue {
    public static void missingValue(int[] arr){
        int n=arr.length;
        int start=arr[0];
        int maxi=arr[n-1];
        int j=start;
        int i=0;
        System.out.print("Missing Value is:");
        while(j<=maxi){
            if(arr[i]!=j){
                System.out.print(j+" ");
                j+=1;
            }
            else if(arr[i]==j){
                i+=1;
                j+=1;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0,1,2,3,5,9,10,11,12,13};
        missingValue(arr);
    }
}
