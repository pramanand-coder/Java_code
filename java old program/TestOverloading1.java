class Adder{  
static void add(int a,int b)
{
System.out.println(a+b);}  
static void add(int a,int b,int c)
{
System.out.println(a+b+c);
}   
static void add(int a,double b)
{
System.out.println("Multiplication="+a*b);} 
static void add()
{
System.out.println("sum=0");}  
} 
class TestOverloading1{  
public static void main(String[] args){  
Adder obj=new Adder();
obj.add();
obj.add(11,11);  
obj.add(11,11,11); 
obj.add(10,5.0); 
}}  
