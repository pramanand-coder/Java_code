
import java.util.Scanner;
public class Non_recursive
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the nth number:");
   int n=sc.nextInt();
   System.out.println("The nth value are:"+fib(n));
  }
 public static int fib(int n)
{
   int a=0,b=1,c=1;
   for(int i=2;i<=n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
return a;
}
}
  
     