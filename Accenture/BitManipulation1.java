import java.util.*;
public class BitManipulation1 {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       //System.out.println("First value:");
       int p=sc.nextInt();
       //System.out.println("Second value:");
       int q=sc.nextInt();
       //System.out.println("Third value:");
       int r=sc.nextInt();
       int x=p^q;
       int count=0;
       while(x>0 || r>0){
         int l1=x&1;
         int l2=r&1;
         if(l1!=l2){
            count+=1;
         }
         x=x>>1;
         r=r>>1;
       }
     System.out.println("count="+count);
   } 
}
