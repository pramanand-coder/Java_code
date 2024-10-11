import java.util.*;
public class OddEven {
    public static String oddEven(int num){
        num=num & 1;
        if(num>0)
        {
          return "odd";
        }
        return "even";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(oddEven(num));
    }
}
