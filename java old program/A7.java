interface Printable
{
 void print();
}
interface Showable
{
 void show();
}
class A7 implements Printable,Showable
{
 public void print()
{
 System.out.println("String is printable.........");
}
public void show()
{
 System.out.println("String is showable..........");
}
public static void main(String args[])
{
 A7 obj=new A7();
 obj.print();
 obj.show();
 }
}