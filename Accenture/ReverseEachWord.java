import java.util.Stack;

public class ReverseEachWord {
    public static String reverseWords(String s) {
     // System.out.println(s);
      Stack<String> st=new Stack<>();
      StringBuilder word=new StringBuilder();
      StringBuilder ans=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==' '){
            if(word.length()>0){
                st.push(word.toString());
                word.setLength(0);
            }
        }
        else{
            word.append(ch);
        }
      } 
      if(word.length()>0){
        st.push(word.toString());
      } 
      while(st.size()>0){
        ans.append(st.pop());
        if(st.size()!=0){
            ans.append(" ");
        }
      }
      return ans.toString();
    }
    public static void main(String[] args){
        String s="  sky is the Blue ";
        String rev=reverseWords(s);
        System.out.println(rev);
    }
}
