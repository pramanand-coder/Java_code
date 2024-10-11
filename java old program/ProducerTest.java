
class Thread1
{
 int num;
 boolean vs=false;
 synchronized int get()
{
 if(!vs)
 try
 {
   wait();
 }
 catch(Exception e)
 {
  System.out.println("Exception ocuurs:"+e);
 }
if(num<5)
{
 System.out.println("Happy Birthday Pramanand");
}
{
 System.out.println("Happy Birthday Jyoti");
 }
 try
{
 Thread.sleep(1000);
 }
catch(Exception e)
{
  System.out.println("Exception ocuurs:"+e);
}
vs=false;
notify();
return num;
}
synchronized int put(int num)
{
 if(vs)
 try
 {
   wait();
 }
 catch(Exception e)
 {
  System.out.println("Exception ocuurs:"+e);
 }
this.num=num;
vs=true;
 if(num<5)
{
 System.out.println("It is one of the greatest day for you");
System.out.println("Jio unlimited year");
}
else
{
 System.out.println("Once more happy birthday");
}
 
 try
{
 Thread.sleep(2000);
 }
catch(Exception e)
{
  System.out.println("Exception ocuurs:"+e);
}
notify();
return num;
}
}
class Producer implements Runnable
{
  Thread1 t;
  Producer(Thread1 t)
  {
   this.t=t;
   new Thread(this,"Producer").start();
  }
  public void run()
  {
   int i=1;
   int x=1;
   while(i<=10)
   {
    t.put(x++);
    i++;
   }
  }
}
 class Consumer implements Runnable
{
  Thread1 t;
  Consumer(Thread1 t)
  {
   this.t=t;
   new Thread(this,"Consumer").start();
  }
  public void run()
  {
   int i=1;
   while(i<=10)
   {
    t.get();
    i++;
   }
  }
}
class ProducerTest
{
 public static void main(String args[])
 {
  Thread1 t1=new Thread1();
  new Producer(t1);
  new Consumer(t1);
 }}
  
  

       

  

 
 