import java.util.Scanner;
public class ChangeBit {
    public static int ChangeIthBit(int num,int pos,int value){
        int mask1=1<<pos;
        mask1=~mask1;
        num=num & mask1;
        int mask2=value<<pos;
        num=num | mask2;
        return num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the position:");
        int pos=sc.nextInt();
        System.out.println("Enter the value:");
        int value=sc.nextInt();
        int ans=ChangeIthBit(num,pos,value);
        System.out.println("after changing:"+ans);
        
    }
}
