
import java.util.Scanner;
import java.io.StringTokenizer;
public class Tokenizer
{
 public static void main(String args[])
 {
  int sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number seprated by space:");
   String s=sc.nextLine();
   StringTokenizer st=new StringTokenizer(s," ");
   while(hasMoreTokens())
  {
   String temp=sc.nextToken();
   int a=Integer.parseInt();
   System.out.println(""+a);
   sum+=a;
  }
System.out.println("Sum="+sum);
}
}

  
    
   