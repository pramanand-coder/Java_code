import java.util.*;
public class ReverseWord {
    public static String reverseWord(String s){
        StringBuilder word=new StringBuilder("");
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                ans.append(word.reverse()+" ");
                word.setLength(0);
            }
            else{
                word.append(ch);
            }
        }
        if(word.length()>0){
            ans.append(word.reverse());
        }
        return ans.toString();

    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
    String s=sc.nextLine();
    String ans=reverseWord(s);
    System.out.println(ans);
    }
    
}
