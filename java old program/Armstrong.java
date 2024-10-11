import java.util.*;
public class Armstrong {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    String num=sc.next();
    int sum=0;
    for(int i=0;i<num.length();i++){
        char ch=num.charAt(i);
        int d1=ch-'0';
        sum+=d1*d1*d1;
    }
    if(sum==Integer.parseInt(num)){
        System.out.println("Armstrong number");
    }
    else{
        System.out.println("Not Armstrong number");
    }
   }
    
}
