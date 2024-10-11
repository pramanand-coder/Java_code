import java.util.*;
public class Anagram {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String s=sc.next();
    HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(hash.containsKey(ch)){
            hash.put(ch,hash.get(ch)+1);
        }
        else{
            hash.put(ch,1);
        }
    }
    int oddcount=0;
    for(Character c:hash.keySet()){
        if(hash.get(c)%2!=0){
            oddcount+=1;
        }
        if(oddcount>1){
            System.out.println("No");
            break;
        }
    }
    if(oddcount<=1){
        System.out.println("Yes");
    }
   }
}
