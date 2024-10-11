
class Addition
{
  public void addition(int a,int b)
  {
    int c;
    c=a+b;
    System.out.println("Addition of "+a+" and "+b+"is "+c);
   }
}
class CheckVowel
{
  public void FindingVowel(char s)
  {
    switch(s)
    {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
           System.out.println(s+ " is a Vowel");
      break;
      default:
           System.out.println(s+" is not a Vowel");
     }
 }
}
public class HighCohesionExample
{
public static void main(String args[])
{
  Addition ad=new Addition();
  ad.addition(87,99);
  CheckVowel ch=new CheckVowel();
  ch.FindingVowel('t'):
  ch.FindingVowel('o');
}
}
}
