import java.util.Scanner;
class Fibo
{
 static int a=0,b=1,c;
static void printFibonacci(int count)
 {
   if(count>0)
   {
   c=a+b;
   System.out.println(""+c);
   a=b;
   b=c;
   printFibonacci(count-1);
 }
}
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of Fibonacci series:");
  int n=sc.nextInt();
  System.out.println(a+"\n"+b);
  printFibonacci(n-2);
 }
}