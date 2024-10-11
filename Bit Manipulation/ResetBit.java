import java.util.*;
public class ResetBit {
    public static int resetIthBit(int num,int pos){
        int mask=1<<pos;
        mask=~mask;
        num=num & mask;
        return num;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       System.out.println("Enter the position:");
       int pos=sc.nextInt();
       int ans=resetIthBit(num,pos);
       System.out.println("After setting bit:"+ans);
    }
}
