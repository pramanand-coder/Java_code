import java.util.*;
public class StringDecoder {
    public static String stringDecoder(String s){
        StringBuilder ans=new StringBuilder("");
        int cnt=0;
        for(char c1:s.toCharArray()){
            if(c1=='1'){
               cnt+=1;
            }
            else{
                int a=64+cnt;
                char c2=(char)a;
                cnt=0;
                ans.append(c2);
            }
        }
        if(cnt!=0){
            int a=64+cnt;
            char c2=(char)a;
            ans.append(c2);
        }
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.next();
        String c=stringDecoder(s);
        System.out.println("ans:"+c);
    }
}
