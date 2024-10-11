import java.io.IOException;
class P
{
  void method()
  {
    throw new IOException("device error");
  }
}
public class Throws
{
 public static void main(String args[])throws IOException
 {
   try{
   P o=new P();
   o.method();
    }
    catch(Exception e)
{
 System.out.println("catch caught");
}
System.out.println("normal flow....");
}
}