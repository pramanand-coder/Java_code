import java.util.concurrent.ThreadLocalRandom;
class Rand
{
  public static void main(String args[])
 {
   System.out.print("Integer number generator\n");
   int a=ThreadLocalRandom.current().nextInt(10,20);
   int b=ThreadLocalRandom.current().nextInt(10,20);
   System.out.println(a+"\n"+b);
   
   System.out.print("Double number generator\n");
   double c=ThreadLocalRandom.current().nextDouble(10,20);
   double d=ThreadLocalRandom.current().nextDouble(10,20);
   System.out.println(c+"\n"+d);
   
   System.out.print("Float number generator\n");
   float e=ThreadLocalRandom.current().nextFloat(10,20);
   float f=ThreadLocalRandom.current().nextFloat(10,20);
   System.out.println(e+"\n"+f);
   
    System.out.print("Boolean number generator\n");
   boolean g=ThreadLocalRandom.current().nextBoolean();
   boolean h=ThreadLocalRandom.current().nextBoolean();
   System.out.println(g+"\n"+h);
  
    System.out.print("Long number generator\n");
   long m=ThreadLocalRandom.current().nextLong(10,20);
   long k=ThreadLocalRandom.current().nextLong(10,20);
   System.out.println(m+"\n"+k);
}}