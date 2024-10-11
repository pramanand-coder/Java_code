import java.util.*;
public class SimplifyPathLeet71{
    public static String SimplifyPathLeet71(String str){
        int n=str.length();
        Stack<String> st=new Stack<>();
        String curr="";
        for(int i=0;i<n;i++){
          char ch=str.charAt(i);
          if(ch=='/'){
            if(curr.equals("..")){
                if(st.size()>0) st.pop();
            }
            else if(curr.length()>0 && !curr.equals(".")){
                st.push(curr);
            }
            curr="";
          }
          else{
            curr+=ch;
          }
        }
        if(curr.equals("..")){
            if(st.size()>0) st.pop();
        }
        else if(curr.length()>0 && !curr.equals(".")){
            st.push(curr);
        }

        StringBuilder ans=new StringBuilder();
        for(String dir:st){
            ans.append("/").append(dir);
        }
        return ans.length()== 0 ? "/":ans.toString();
    }
    public static void main(String[] args){
        String a="/local/user/documents//../pictures/.";
        System.out.println(SimplifyPathLeet71(a));
    }
}