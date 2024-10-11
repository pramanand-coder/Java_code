import java.util.Scanner;
public class GCD{
    public static int gcd1(int m,int n){
        int mini=Math.min(m,n);
        int arr[]=new int[mini];
        int j=-1;
        for(int i=1;i<=mini;i++){
          if(m%i==0 && n%i==0){
            arr[++j]=i;
          }
        }
        return arr[j];
    }
    public static int gcd2(int m,int n){
        int mini=Math.min(m,n);
        int i;
        for(i=mini;i>0;i--){
          if(m%i==0 && n%i==0){
            break;
          }
        }
        return i;
    }
    public static int gcd3(int m,int n){
        if(m==n){
            return n;
        }
        int mini=Math.min(m,n);
        int maxi=Math.max(m,n);
        return gcd3(mini,maxi-mini);
    }
    public static int gcd4(int m,int n){
        if(n==0){
            return m;
        }
        int mini=Math.min(m,n);
        int maxi=Math.max(m,n);
        return gcd4(mini,maxi%mini);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+"="+GCD.gcd1(a,b));
        System.out.println("GCD of "+a+" and "+b+"="+GCD.gcd2(a,b));
        System.out.println("GCD of "+a+" and "+b+"="+GCD.gcd3(a,b));
        System.out.println("GCD of "+a+" and "+b+"="+GCD.gcd4(a,b));
    }
    
}