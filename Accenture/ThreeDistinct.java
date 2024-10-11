import java.util.*;
public class ThreeDistinct{
    public static void print3Largest(int[] arr,int n){
        if(arr.length<3){
            System.out.println("Invalid Input");
            return;
        }
        int first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.println("first="+first+" second="+second+" third="+third);
    }
    public static void main(String[] args){
        int arr[] = { 12, 13, 1, 10, 34, 1 };
        int n = arr.length;
        print3Largest(arr, n);
    }
}