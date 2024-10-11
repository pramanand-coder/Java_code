import javax.swing.*;
abstract class Shape
{
public abstract void numberOfSides();
}
class Trapezoid extends Shape
{
public void numberOfSides()
{
JOptionPane.showMessageDialog(null,"TRAPEZOID -- Number of sides in trapezoid is 4 (Of which two are parallel and 
with no angles)");
}
}
class Triangle extends Shape
{
public void numberOfSides()
{
JOptionPane.showMessageDialog(null,"TRIANGLE -- Number of sides in Triangle is 3 ");
}
}
class Hexagon extends Shape
{
public void numberOfSides()
{
JOptionPane.showMessageDialog(null,"HEXAGON -- Number of sides in Hexagon is 6 ");
}
}
class ShapeDemo
{ 
public static void main(String[] args)
{
JOptionPane.showMessageDialog(null,"Some of the Geometrical figures are as follows " );
Trapezoid t=new Trapezoid();
Triangle tg=new Triangle();
Hexagon h=new Hexagon();
t.numberOfSides();
tg.numberOfSides();
h.numberOfSides();
}
}