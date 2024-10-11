
enum games
{
 cricket,football,batminten,ballyboll;
}
class EnumTest
{
 public static void main(String args[])
{
 System.out.pritnln("Iterating the games");
for(games index:games.values())
{
 System.out.println(index);
}
}
}