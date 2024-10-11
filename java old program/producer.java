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
class producer implements Runnable
{
 Thread1 t;
producer(Thread1 t)
{
  this.t=t;
  new Thread(this,"producer").start();
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
class consumer implements Runnable
{
 Thread1 t;
consumer(Thread1 t)
{
  this.t=t;
  new Thread(this,"consumer").start();
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
class Producer
{
 public static void main(String arsgs[]) throws Exception
{
  Thread1 t=new Thread1();
new producer(t);
new consumer(t);
}
}


 