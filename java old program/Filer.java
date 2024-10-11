import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
class Filer
{
 public static void main(String args[]) throws Exception
{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the file name:");
File f=new File(sc.nextLine());
if(f.exists())
{
  BufferedReader br=new BufferedReader(new FileReader(f));
int lineno=0;
String line=br.readLine();
while(line!=null)
{
  lineno+=1;
  System.out.println(lineno+" "+line);
line=br.readLine();
}
}
}
}