import java.util.*;
public class Array1 {
    public static void main(String[] args){
        int[] arr={1,0,1,1,1,0,0,1,0,0};
        int left=0,right=0;
        while(right<arr.length){
            if(arr[right]==1){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;

                left+=1;
                right+=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
}
