import java.util.*;
public class SetBit {
    public static int setIthBit(int num,int pos){
        int mask=1<<pos;
        num=num | mask;
        return num;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=sc.nextInt();
       System.out.println("Enter the position:");
       int pos=sc.nextInt();
       int ans=setIthBit(num,pos);
       System.out.println("After setting bit:"+ans);
    }
}
