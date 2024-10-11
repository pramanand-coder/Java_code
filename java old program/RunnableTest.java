public class RunnableTest
{
 public static void main(String args[])
{
  Runnable r1=new Runnable()
{
 public void run()
{
 System.out.println("Running with Anynous function");
}
};
Runnable r2=()->
{
 System.out.println("Running with Lamda expresssion");
};
new Thread(r1).start();
new Thread(r2).start();
}}
