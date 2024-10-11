import java.util.*;
class Test{
    public static void main(String[] args){
      /* 
       String s="Sri Venakateswara College";
       System.out.println(s.length());
       System.out.println("Dislaying the string");
       for(int i=0;i<s.length();i++){
        System.out.print(s.charAt(i)+" ");
       }
       System.out.println("");
       System.out.println(s.contains("V"));  //check weather the s contains V or not
       */
    /* 
       System.out.println("Displaying the substring");
       for(int i=0;i<s.length();i++){
        for(int j=i+1;j<s.length();j++){
        System.out.print(s.substring(i,j)+" ");
       }

    }
       
      System.out.println(s.startsWith("Sri"));
      System.out.println(s.endsWith("fge"));
      System.out.println(s.toLowerCase());
      System.out.println(s.toUpperCase());
      System.out.println(s.indexOf("wara"));
      System.out.println(s.indexOf("a"));
      System.out.println(s.indexOf('a'));
      System.out.println(s.substring(1));
      System.out.println(s.substring(1,4));
      String s1="";
      s1.concat(s);
      System.out.println(s1);
      s1=s1.concat(s);
      System.out.println(s1);
      */
      StringBuilder s=new StringBuilder("John");
      String s1="bobby";
      System.out.println(s+s1);  //Johnbobby
      //System.out.println(s+'1');  //we cann't add character here
      System.out.println(s+"a");  //johna
      char ch='p';
      String c=String.valueOf(ch);
      System.out.println(s+c);
     /* 
      String s2="9876";
      int a=Integer.valueOf(s2);
      System.out.println(a+24); //9900
      // Character to Digit
      char c1='9';
      int a1=Integer.parseInt(String.valueOf(c1));
      int a2=c1-'0';
      int a3=Character.getNumericValue(c1);
      int a4=Character.digit(c1,10);
      System.out.println(a1+" "+a2+" "+a3+" "+" "+a4);
      System.out.println(Character.digit(c1,16));
     */
    System.out.println(s);  //John
    s.append("Bob");
    System.out.println(s);  //JohnBob
    s.insert(0,'P');
    System.out.println(s);    //PJohnBob
    s.setCharAt(1,'K');
    System.out.println(s);       //PKohnBob
    s.deleteCharAt(0);
    System.out.println(s);     //KohnBob
    s.delete(4,7);   //Kohn
    System.out.println(s);
    s.setCharAt(0,'J');  //John
    s.reverse();
    System.out.println(s);      //nhoJ
    System.out.println(s.substring(2));
   /// System.out.println(s.contains("J"));   contains is not available in StringBuilder
    // System.out.println(s1.contains('B'));  conatains method take string as a parameter
    System.out.println(s1.contains("B"));

    }
}