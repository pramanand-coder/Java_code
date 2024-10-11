import java.lang.reflect.*;
class Method1
{
public static void main(String[] args) throws Exception
{
int count=0;
Class c=Class.forName("java.lang.Object");
Method[] m=c.getDeclaredMethods();
for(Method m1:m)
{
System.out.println(m1.getName());
count++;
 
}
System.out.println("Total number of method:"+count);
}
}