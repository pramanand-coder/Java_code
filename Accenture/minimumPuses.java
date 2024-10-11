import java.util.Arrays;

class minimumPuses {
    public static int minimumPushes(String word) {
        int[] count=new int[26];
        for(char c:word.toCharArray()){
            count[c-'a']++;
        }
        Arrays.sort(count);
    /* 
        for(int i=25;i>=0;i--){
            System.out.println(count[i]);
        }
    */
        int num=0,res=0;
        for(int i=25;i>=0;i--){
            if(num<8){
                res+=count[i];
            }
            else if(num<16){
                res+=count[i]*2;
            }
            else if(num<24){
                res+=count[i]*3;
            }
            else{
                res+=count[i]*4;
            }
            num++;
        }
        return res;
    }
    public static void main(String[] args){
       int n=minimumPushes("xyzxyzxyzxyz");
       System.out.println(n);
    }
}