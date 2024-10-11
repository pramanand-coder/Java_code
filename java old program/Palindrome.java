import java.util.*;

public class Palindrome
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int i,j;
     System.out.println("Enter the string:");
     String s=sc.next();
     for(i=0,j=s.length()-1;i<=j;i++,j--)
     {
      if(s.charAt(i)==s.charAt(j));
      else
      {
          System.out.println("it is not a palindrome");
          System.exit(1);
       }
     }
    System.out.println("It is palindrome");
  }
}