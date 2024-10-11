import java.util.*;
public class Sandwitch {
    public static String BreadColor(String s){
        StringBuilder s1=new StringBuilder("");
        char c=s.charAt(0);
        int i=1;
        while(i<s.length()){
            if(c==s.charAt(i)){
                s1.append(c);
                if(i+1<s.length()){
                    c=s.charAt(i+1);
                    i+=2;
                }
                else{
                    break;
                }
            }
            else{
                i++;
            }
        }
        return s1.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("Answer:"+BreadColor(s));
    }
}
