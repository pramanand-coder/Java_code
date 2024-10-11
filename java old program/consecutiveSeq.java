import java.util.Stack;
public class consecutiveSeq{
    public static int[] ConSeq(int[] arr){
     int n=arr.length;
     Stack<Integer> st=new Stack<>();
     int[] res=new int[n];
     for(int i=0;i<n;i++){
        if(st.size()==0 || st.peek()!=arr[i]){
            st.push(arr[i]);
        }
        else{
            if(i==n-1 || arr[i]==arr[i+1]){
                st.pop();
            }
        }
        int m=st.size();
        for(int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args){
        int arr[]={1,2,2,3,3,3,4,10,10,10,5,6,6,8};
        int[] res=ConSeq(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}