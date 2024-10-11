import java.lang.Exception;
public class Throw
{
  public static void validate(int age)
  { 
    if(age<18)
    {
      throw new NumberFormatException("Not eligible to vote");
    }
   else
      System.out.println("eligible");
   }
  public static void main(String[] args)
 {
    validate(16);
 }
}