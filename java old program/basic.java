import java.util.*;
class basic {
    // Function to sort an array of 0s, 1s, and 2s
    public static void swap(ArrayList<Integer> arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public static void sort012(ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        int i=0,mid=0,j=n-1;
        while(mid<j){
            if(arr.get(mid)==0){
                swap(arr,i,mid);
                i++;
                mid++;
            }
            else if(arr.get(mid)==2){
                swap(arr,mid,j);
                j--;
            }
            else{
                mid++;
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(0,2,1,0,1,2));
        System.out.println(arr);
        sort012(arr);
        System.out.println(arr);
    }
}