import java.util.*;
public class EqualRowColumn {
        public static int equalPairs(int[][] grid) {
            HashMap<List<Integer>,Integer> hash=new HashMap<>();
            int n=grid[0].length;
            for(int i=0;i<n;i++){
                List<Integer> l1=new ArrayList<>();
                for(int j=0;j<n;j++){
                    l1.add(grid[i][j]);
                }
                hash.put(l1,hash.getOrDefault(l1,0)+1);
                List<Integer> l2=new ArrayList<>();
                for(int j=0;j<n;j++){
                    l2.add(grid[j][i]);
                }
               hash.put(l2,hash.getOrDefault(l2,0)+1); 
            }
            if(hash.size()==1)
            {
                for(int val:hash.values()){
                    return val;
                }
            }
        int cnt=0;
        for(var s:hash.values()){
            if(s>1){
                cnt+=s-1;
            }
        }
        System.out.println(hash.values());
        return cnt;
        }
        public static void main(String[] args){
            int[][] grid={{3,2,1},{1,7,6},{2,7,7}};
            int[][] grid1={{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
            int[][] grid2={{12,12,},{12,12}};
           System.out.println(equalPairs(grid2));
        }
}
