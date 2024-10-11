import java.util.*;
public class hash {
    public static void main(String[] args){
        String s="tree";
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        for(char c:s.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0)+1);
        }
        System.out.println(hash);
        System.out.println(hash.entrySet());
       List<Map.Entry<Character,Integer>> entry=new ArrayList<>(hash.entrySet());
       System.out.println(entry);
       entry.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));
       System.out.println(entry);
       StringBuilder sb=new StringBuilder("");
       for(Map.Entry<Character,Integer> e:entry){
          for(int i=0;i<e.getValue();i++){
            sb.append(e.getKey());
          }
       }
       System.out.println(sb.toString());
    }
}
