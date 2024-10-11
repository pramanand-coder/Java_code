import java.util.*;
public class ResetIBit {
    public static int resetLastiBit(int num,int i){
        int mask=~0;
        mask=mask<<i;
        num=num & mask;
        return num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the number of bits:");
        int n=sc.nextInt();
        System.out.println("after reset number is:"+resetLastiBit(num,n));
    }
    
}
