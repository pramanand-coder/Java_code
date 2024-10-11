import java.util.*;
public class CountSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                int j=i+1;
                while(j<s.length()){
                    if(s.charAt(j)=='1'){
                        cnt++;
                    }
                    j++;
                }
            }
        }
        System.out.println("Answer:"+cnt);
    }
}
