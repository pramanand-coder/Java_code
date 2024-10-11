
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Employee
{
 int id;
String name;
double salary;
public Employee(int id,String name,double salary)
{
 super();
 this.id=id;
this.name=name;
this.salary=salary;
}
}
public class LamdaComparator
{
 public static void main(String args[])
{
 List<Employee>list=new ArrayList<Employee>();
list.add(new Employee(111,"Pramanand",1000000000);
list.add(new Employee(112,"Mukku",1000000);
list.add(new Employee(113,"Vikash",400000);
System.out.println("Sorting the Employee list based on the name");
Collections.sort(list,(p1,p2)->
{
return p1.name.compareTo(p2.name);
});
for(Employee e:List)
{
System.out.println(e.id+" "+e.nam+""+e.salary);
}
}
}											