
import java.util.*;
import java.io.*;
import java.lang.*;
class CFG
{
 static int FirstNonRepeating(String str)
{
 int NO_OF_CHARS=256;
int[] arr=new int[NO_OF_CHARS];
int i;
for(i=0;i<NO_OF_CHARS;i++)
 arr[i]=-1;
for(i=0;i<str.length();i++)
{
  if(arr[str.charAt(i)]==-1)
    arr[str.charAt(i)]=i;
 else
   arr[str.charAt(i)]=-2;
}
int res=Integer.MAX_VALUE;
for(i=0;i<NO_OF_CHARS;i++)
if(arr[i]>=0)
res=Math.min(res,arr[i]);
return res;
}
public static void main(String args[])
{
  String str="sri venkateswara college of engineering and technology,chittor";
int index=FirstNonRepeating(str);
if(index==Integer.MAX_VALUE)
  System.out.println("Either all characters are repeating or empty string");
else
  System.out.println("First Non Repeating character are "+str.charAt(index));
}
}