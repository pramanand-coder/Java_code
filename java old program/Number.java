import java.util.*;
public class Number {
    public static void Spynumber(int num){
        String s=Integer.toString(num);
        int digitSum=0;
        int digitMul=0;
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'0';
            digitSum+=d;
            digitMul*=d;
        }
        if(digitSum==digitMul){
            System.out.println(num+" is a Spy Number");
        }
        else{
            System.out.println(num+" is not a Spy Number");
        }
    }
    public static void Automorphic(int s){
        int num=s;
        int dlen=Integer.toString(num).length();
        num=num*num;
        String str=Integer.toString(num);
        int tlen=str.length();
        int s1=Integer.parseInt(str.substring(tlen-dlen));
        if(s==s1){
            System.out.println(s+" is a Neon Number");
        }
        else{
            System.out.println(s+" is not a Neon Number");
        }
    }

    public static void Neon(int s){
      int num=s;
      num=num*num;
      String s1=Integer.toString(num);
      int sum=0;
      for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        int d1=ch-'0';
        sum+=d1;
      }
      if(sum==s){
        System.out.println(s+" is Neon number");
      }
      else{
        System.out.println(s+" is not Neon number");
      }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  number");
    int s=sc.nextInt();
    //Neon(s);
    //Automorphic(s);
    Spynumber(s);
    }
}
