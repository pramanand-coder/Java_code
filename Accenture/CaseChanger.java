import java.util.*;
public class CaseChanger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=s.charAt(0);
        if(s.matches(".*\\d.*")){
            System.out.println(s);
        }
        else if(Character.isUpperCase(c)==true){
            System.out.println(s.toUpperCase());
        }
        else if(Character.isLowerCase(c)){
            System.out.println(s.toLowerCase());
        }
    }
}
