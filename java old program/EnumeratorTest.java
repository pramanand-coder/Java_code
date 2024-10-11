
import java.util.*;
import java.io.*;
import java.lang.*;
class CFG
{
 static int FirstNonRepeating(String str)
{
  int NO_OF_CHARS=256;
int[] arr=new arr[NO_OF_CHARS];
for(int i=0;i<NO_OF_CHARS;i++)
 arr[i]=-1;

for(int i=0;i<str.length();i++)
{
  if(arr[str.charAt(i)]==-1)
    arr[str.charAt(i)]=i;
  else
    arr[str.charAt(i)]=-2;
}
int res=Integer.MAX_VALUE;
for(int i=0;i<NO_OF_CHARS;i++)
{
 if(arr[i]>=0)
    res=Math.min(res,arr[i]);
    return res;
}
public static void main(String args[])
{
 String s="Sri Venkateswara College Of Engineering And Technology";
int index=FirstNonRepeating(s);
if(index==Integer.MAX_VALUE)
   System.out.pritnln("All characters are repeating or string are empty");
else
   System.out.pritnln("First Non Repeating Charater are"+s.charAt(index));
}
}