import javax.swing.*;
abstract class shape
{
 public abstract void numberOfSides();
}
class Trapezoid extends shape
{
 public void numberOfSides()
{
 JOptionPane.showMessageDialog(null,"Trapezoid->No of sides is 4");
}
}
class Triangle extends shape
{
 public void numberOfSides()
{
 JOptionPane.showMessageDialog(null,"Triangle->No of sides is 3");
}
}
class Hexagon extends shape
{
 public void numberOfSides()
{
 JOptionPane.showMessageDialog(null,"Hexagon->No of sides is 6");
}
}
public class ShapeDemo
{
 public static void main(String args[])
{
  Trapezoid t=new Trapezoid();
  Triangle tg=new Triangle();
  Hexagon h=new Hexagon();
t.numberOfSides();
tg.numberOfSides();
h.numberOfSides();
}
}