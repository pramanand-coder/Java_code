import java.util.*;
public class SwapString {
    public static String Swap(String s,int n,int[] arr){
        StringBuilder sb=new StringBuilder(s);
        for(int i:arr){
            if(i==1){
                char temp=sb.charAt(0);
                sb.setCharAt(0,sb.charAt(sb.length()-1));
                sb.setCharAt(sb.length()-1,temp);
            }
            else if(i==2){
                int mid=(s.length())/2;
                int j=0,k=mid;
                while(j<mid && k<s.length()){
                   char temp=sb.charAt(j);
                   sb.setCharAt(j,sb.charAt(k));
                   sb.setCharAt(k,temp);
                   j++;
                   k++;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s="ABCD";
        int n=3;
        int[] l={1,2,1};
        System.out.println(Swap(s,n,l));
    }
}
