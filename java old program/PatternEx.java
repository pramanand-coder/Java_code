class PatternEx
{
  public static void main(String args[])
  {
    int i,j,row=6;
    for(i=1;i<=row;i++)
    {
      for(j=(row-1);j>1;j--)
      {
       System.out.println(" ");
      }
     for(j=1;j<=i;j++)
     {
       System.out.println("* ");
     }
     System.out.println();
   }
  }
}