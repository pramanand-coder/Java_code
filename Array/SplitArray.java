import java.util.*;
public class SplitArray{
    public static void Split1(int[] arr){
      int n=arr.length;
      int[] odd=new int[n/2 +1];
      int even[]=new int[n/2 +1];
      int n1=0,n2=0;
      for(int i=0;i<n;i++){
        if(i%2 ==0){
            even[n2++]=arr[i];
        }
        else{
            odd[n1++]=arr[i];
        }
      }
      //System.out.println("First Part:"+Arrays.toString(odd));
      //System.out.println("Second part:"+Arrays.toString(even));
      System.out.print("First part:");
      for(int i=0;i<n1;i++){
        System.out.print(odd[i]+" ");
      }
      System.out.print("Second part:");
      for(int i=0;i<n2;i++){
        System.out.print(even[i]+" ");
      }
    }
    public static void Split2(int[] arr){
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        System.out.println("Even List:"+even);
        System.out.println("Odd List: "+odd);

        int[] evenArray=even.stream().mapToInt(i->i).toArray();
        int[] oddArray=odd.stream().mapToInt(i->i).toArray();
        System.out.print("Even Array: ");
        for(int i=0;i<evenArray.length;i++){
            System.out.print(evenArray[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Odd Array: ");
        for(int i=0;i<oddArray.length;i++){
            System.out.print(oddArray[i]+" ");
        }
    }
    public static void Split3(int[] arr){
        int firstHalf[]=Arrays.copyOfRange(arr,0,arr.length/2);
        int secondHalf[]=Arrays.copyOfRange(arr,arr.length/2,arr.length);
        System.out.println("First Half:"+Arrays.toString(firstHalf));
        System.out.println("Second Half:"+Arrays.toString(secondHalf));
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        //Split1(arr);
        //Split2(arr);
        Split3(arr);
    }
}