import java.util.*;
public class PositiveOrNegative {
    public static String posOrNeg(int num){
        int mask=1<<31;
        int res=num & mask;
        if(res!=0)
        {
        return "Negative";
        }
        return "positive";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(posOrNeg(num));
    }
}
