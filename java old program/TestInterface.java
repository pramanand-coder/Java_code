
import java.util.Scanner;
public class Recursive
{
 Scanner sc=new Scanner();
 System.out.println("Enter the nth value:");
 int n=sc.nextInt();
 System.out.println("nth value are:"+fib(n));
 public static int fib(int n)
 {
   if n==1
     return 0;
   else if n==2
     return 1;
   return fin(n-1)+fib(n-2);
 }
}