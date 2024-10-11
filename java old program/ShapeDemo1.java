
import javax.swing.*;
abstract class Shape
{
 public abstract void A();
}
class Trapezoid extends A
{
 public void A()
{
 JOptionPane.showMessage(null,"PRAMANAND KUMAR CSE");
}
}
class R extends A
{
 public void A()
{
 JOptionPane.showMessage(null,"Rakesh KUMAR CSE");
}
}
class C extends A
{
 public void A()
{
 JOptionPane.showMessage(null,"Chandan KUMAR CSE");
}
}
public class ShapeDemo
{
 public static void main(String args[])
{
 JOptionPna.showMessage(null,"SOME FRiENDS NAME");
 Trapezoid t=new Trapezoid();
R r=new R();
C c=new C();
}
}