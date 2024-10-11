import java.util.*;
public class AdvancedSubArray{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       sc.nextLine();
       String s=sc.nextLine();
       int[] arr=Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
       int maxi=Integer.MIN_VALUE;

       for(int i=0;i<n-k+1;i++){
          int score=0;
          int p=1;
          for(int j=i;j<i+k;j++){
            score+=arr[j]*p;
            p++;
          }
          maxi=Math.max(score,maxi);
       }
       System.out.println("SCore="+maxi);
    }
}