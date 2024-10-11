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
System.out.println("Exception"+e);
}
System.out.println("get"+num);
try
{
 Thread.sleep(1000);
}
catch(Exception e)
{
 System.out.println("Exception"+e);
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
System.out.println("Exception"+e);
}
this.num=num;
vs=true;
System.out.println("put"+num);
try
{
 Thread.sleep(1000);
}
catch(Exception e)
{
 System.out.println("Exception"+e);
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
 int x=0,i=0;
while(i<10);
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
 int i=0;
while(i<10);
{
 t.get();
 i++;
}
}
}
class ProducerConsumer1
{
 public static void main(String args[])
{
  Thread1 t=new Thread1();
new Producer(t);
new Consumer(t);
}
}


 