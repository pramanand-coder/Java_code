
class Test1
{
 static int i=10;
 static
 {
  m1();
  System.out.println("first static block");
 }
 public static void main(String args[])
 {
  m1();
  System.out.println("Main Method");
 }
 public static void m1()
 {
  System.out.println(j);
 }
 static
 {
   System.out.println("Second static block");
 }
 static int j=20;
}
class Base extends Test
{
 static int x=10;
 static
 {
  m1();
  System.out.println("first static block of main");
 }
 public static void main(String args[])
 {
  m1();
  System.out.println("Main Method of main");
 }
 public static void m1()
 {
  System.out.println(j);
 }
 static
 {
   System.out.println("Second static block of main");
 }
 static int y=20;
}

 
   
   

