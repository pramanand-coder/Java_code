import java.util.*;
public class flipCharacter {
    public static String FlipCharacter(String s){
        StringBuilder s1=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char a=(char)(122-(c-'a'));
            s1.append(a);
        }
        return s1.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       System.out.println("After Flipping:"+FlipCharacter(s));
    }
}
