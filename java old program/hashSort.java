import java.util.*;
public class hashSort {
    public static void main(String...args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the string:");
       String s=sc.next();
       HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
       for(char c:s.toCharArray()){
        hash.put(c,hash.getOrDefault(c,0)+1);
       }
       System.out.println(hash.entrySet());
       List<Map.Entry<Character,Integer>> entry=new ArrayList<>(hash.entrySet());
       entry.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));
       System.out.println(entry);
       StringBuilder sb=new StringBuilder("");
       for(Map.Entry<Character,Integer> c:entry){
        for(int i=0;i<c.getValue();i++){
            sb.append(c.getKey());
        }
       }
       System.out.println(sb.toString());
    }
}
