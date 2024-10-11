import java.util.Stack;
public class StockSpan{
    public static int[] Span1(int[] price){
        //Stack<Integer> st=new Stack<>();
        int res[]=new int[price.length];
        int n=price.length;
        res[0]=1;
        for(int i=1;i<n;i++){
            int span=1;
            if(price[j]<price[i]){
                    sp++;
         }
                else{
                    break;
                }
            }
            res[i]=sp;
        }
        return res;

    }
    //using stack
    public static int[] Span2(int[] price){
        Stack<Integer> st=new Stack<>();
        int n=price.length;
        int res[]=new int[price.length];
        st.push(0);
        res[0]=1;
        for(int i=1;i<n;i++){
           while(st.size()>0 && price[st.peek()]<=price[i]){
            st.pop();
           }
           if(st.size()==0){
            res[i]=i+1;
           }
           else{
            res[i]=i-st.peek();
           }
           st.push(i);

        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={100,80,75,70,60,75,85};
        int res[]=Span1(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}