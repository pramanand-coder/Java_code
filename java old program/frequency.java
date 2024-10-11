
import java.util*;
import java.io.*;
public class Fileinfo
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the file name:");
  File f=new File(sc.nextLine());
  System.out.println(f.exist()?"file is exist":"File is not exit");
    System.out.println(f.canRead()?"File is Readable":"File is not readable");
   System.out.println(f.canWite()?"file is writable":"File is not writable");
   System.out.println("FileName="+f.getName());
   System.out.println("path="+f.getPath());
     System.out.println(f.isDirectory()?"is a directory":"Simple file");
   System.out.println("AbsolutePath=+f.getAbsolutePath());
 }
}