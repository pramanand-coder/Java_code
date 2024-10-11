import java.util.Scanner;
import java.lang.Math;
class Arm
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the last number:");
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
   {
     if(isPrint(i))
         System.out.println(" "+i);
   }
  }
 static boolean isPrint(int p)
 {
   int temp,last,digits=0;
int sum=0;
   temp=p;
   while(temp>0)
   {
     temp=temp/10;
     digits=digits+1;
    }
  temp=p;
  while(temp>0)
  {
    last=temp%10;
    sum+=(Math.pow(last,digits));
    temp=temp/10;
  }
  if(sum==p)
     return true;
  else
     return false;
 }
}
