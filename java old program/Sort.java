
import java.util.*;
public class frequency
{
 public static void man(String args[])
 {
   Scanner sc=new Scanner();
    System.out.println("Enter any sequence of sentence:");
    String s=sc.nextLine();
    StringTokenizer st=new StringTokenizer(s," ");
   int i=0;
    while(st.hasMoreTokens())
    {
      st.nextToken();
      i++;
     }
 System.out.println("The frequency count="+i);
}
}