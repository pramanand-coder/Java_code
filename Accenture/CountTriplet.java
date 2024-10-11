import java.util.*;
public class CountTriplet {
    public static int countTriplate(int[] arr,int target){
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int mul=arr[i]*arr[j]*arr[k];
                if(mul==target){
                    cnt++;
                    j++;
                    k--;
                }
                else if(mul>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int target=sc.nextInt();
        System.out.println("Count="+countTriplate(arr,target));

    }
}
