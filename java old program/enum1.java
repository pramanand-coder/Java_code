
enum games
{
 Ludo,Football,Cricket,Carrom;
}
public class enum1
{
public static void main(String args[])
{
 System.out.println("using for each loop");
for(games index:games.values()){
System.out.println(index);
}
}}