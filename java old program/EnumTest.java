enum Players
{
 Sachin(9999),
Rohit(78999),
Dhoni(9999),
Hardik(8998),
Virat(999999)
;
private int runs;
Players(int r)
{
 runs=r;
}
int getRuns()
{
 return runs;
}
}
public class EnumeratorTest
{
 public static void main(String args[])
{
 System.out.println("Using for each loop");
for(Players a:Players.values())
{
 System.out.println(a+"has scored"+a.getRuns()+"in ODI");
}
}
}

