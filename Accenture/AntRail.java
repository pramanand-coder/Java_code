import java.util.*;
public class AntRail {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int[] arr=Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
            if(sum1==0){
                cnt++;
            }
        }
        System.out.println("Answer:"+cnt);

    }
}
