import java.util.*;
class frequencyCount{
    public static void main(String[] args){
        int[] arr={1,3,2,1,4,1};
        Map<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int k:arr){
            hash.put(k,hash.getOrDefault(k,0)+1);
        }
        List<Map.Entry<Integer,Integer>> entry=new ArrayList<>(hash.entrySet());
        entry.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        for(var e:entry){
            System.out.println(e.getKey()+"-->"+e.getValue());
        }
    }
}