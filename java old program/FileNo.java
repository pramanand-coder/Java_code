
import java.util.*;
import java.io.*;
public class FileDeep
{
 public static void main(String args[])throws Exception
 {
  int wordcount=0,linecount=0,charcount=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the file name:");
  File f=new File(sc.nextLine());
   BufferedReader br=new BufferedReader(new FileReader(f));
   String line=br.readLine();

   String line=br.readLine();
   while(line!=null)
   {
     String[] words=line.split(" ");
     wordcount+=words.length();
     for(String word:words)
     {
        charcout+=wordlength();
    }
    linecount+=1;
    line=br.readLine();
}
System.out.println("Total words:"+wordcount);
System.out.println("Total words:"+linecount);
System.out.println("Total words:"+charcount);
}}
