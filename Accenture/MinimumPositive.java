import java.util.*;
public class MinimumPositive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length && arr[i]<0){
           i++;
        }
        int j=1;
        boolean flag=false;
        for(int k=i;k<arr.length;k++){
            if(arr[k]!=j){
                System.out.println("Answer="+j);
                flag=true;
                break;
            }
            j++;
        }
        if(flag==false){
        System.out.println("Answer="+j);
        }
    }
}
