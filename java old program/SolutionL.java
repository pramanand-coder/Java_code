import java.util.*;
class SolutionL {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            //System.out.println("Hello");
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                if(ch==')'){
                    if(st.peek()!='('){
                        return false;
                    }
                    st.pop();
                }
                if(ch=='}'){
                    if(st.peek()!='{'){
                        return false;
                    }
                    st.pop();
                }
                 if(ch==']'){
                    if(st.peek()!='['){
                        return false;
                    }
                    st.pop();
                }
            }
        }
        if(st.size()>0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}