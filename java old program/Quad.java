import java.util.Scanner;
class Quad
{
  public static void main(String args[])
  {
    double a,b,c,d;
    double root1,root2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number(a):");
    a=sc.nextInt();
    System.out.println("Enter the second number(b):");
    b=sc.nextInt();
    System.out.println("Enter the Third number(c):");
    c=sc.nextInt();
    d=b*b-4*a*c;
    if(d>0)
    {
      System.out.println("Roots are real and unequal");
      root1=(-b+Math.sqrt(d))/2*a;
      root2=(-b-Math.sqrt(d))/2*a;
      System.out.println("root1="+root1);
      System.out.println("root2="+root2);
     }
    else if(d==0)
    {
       System.out.println("Roots are real and equal");
       root1=root2=-b/2*a;
       System.out.println("root1=root2="+root1);
    }
   else
   {
     System.out.println("Roots are imaginary");
   }
}
}
     
     
      
      

    