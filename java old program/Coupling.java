//Tight Coupling
class A
{
  public String name;
  public void setName(String s)
  {
    if(s==null)
    {
      System.out.println("Cann't initialized the name");
     }
    else
       name=s;
   }
 public String getName()
 {
   if(name!=null)
       return name;
   else
      return "Not initialized";
  }
 }
class B
{
  public static void main(String args[])
  {
    A obj=new A();
    obj.name="PramanandKumar" ;//Diectly setting the value of data member due to tight coupling between the class A and B
    System.out.println("Name is "+ obj.getName());
  }
}

//Loose Coupling
class C
{
  private String name;
  public void setName(String s)
  {
    if(s==null)
    {
      System.out.println("Cann't initialized the name");
     }
    else
       name=s;
   }
 public String getName()
 {
   if(name!=null)
       return name;
   else
      return "Not initialized";
  }
 }
class D
{
  public static void main(String args[])
  {
    C obj1=new C();
    obj1.setName("Jyoti Kumari");//Loose coupling between class A and B
 System.out.println("Name is "+ obj1.getName());
  }
}