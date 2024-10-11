import java.util.*;
public class DiwaliContest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int time=sc.nextInt();
        int rem=240-time;
        int i=1,cnt=0;
        while(5*i<=rem){
           cnt++;
           rem=rem-5*i;
           i++;
        }
        System.out.println("Number of Problem:"+cnt);
    }
}
