import java.util.*;
public class BitManipulation {
    public static void ToggleKthBit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the bit position to toggle:");
        int k=sc.nextInt();
        int mask=1<<k-1;
        int res=num ^ mask;
        System.out.println("After toggle kth bit number is:"+res);
    }
    public static void setKthBit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the bit position to set:");
        int k=sc.nextInt();
        int mask=1<<k-1;
        int res=num | mask;
        System.out.println("After set the bit number is:"+res);
    }
    public static boolean CheckPosOrNeg(int num){
        return num>>31 ==0;
    }
    public static void cleat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        if(CheckPosOrNeg(a) ^ CheckPosOrNeg(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
    public static void main(String[] args){
       // ToggleKthBit();
       //setKthBit();
       cleat();

    }
}
