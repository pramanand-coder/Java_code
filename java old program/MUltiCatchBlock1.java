
class MultipleTry
{
  public static void main(String[] args)
  {
    try
    {
       try
       {
          int a,b;
          a=10;
          b=a/0;
         System.out.println("This is first");
        }
       catch(ArithmeticException e)
       {
          System.out.println(e);
          System.out.println("Division error handled");
        }
        try
        {
           int[] a=new int[8];
           a[10]=56;
         }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println(e);
           System.out.println("Second error handled");
         }
        System.out.println("out of first try block");
      }
     catch(Exception e)
     {
       System.out.println(e);
       System.out.println("outer try");
     }
   }
}