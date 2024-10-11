import java.util.Scanner;

class Array1 {
    public static int[] Sort1(int[] arr,int size){
        int n=size;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of matrix:");
    int n=sc.nextInt();
    int[] oddarr=new int[(n+1)/2];
    int[] evenarr=new int[(n+1)/2];
    int p=0,q=0;
    for(int i=0;i<n;i++){
        System.out.print("Enter the "+i+"th element:");
        if(i%2==0){
            evenarr[p]=sc.nextInt();
            p=p+1;
        }
        else{
            oddarr[q]=sc.nextInt();
        }
    }
    evenarr=Sort1(evenarr,p);
    oddarr=Sort1(oddarr,q);
    System.out.print("Even Array: ");
    for(int i=0;i<p;i++){
        System.out.print(evenarr[i]+" ");
    }
    System.out.println(" ");
    System.out.print("Odd Array: ");
    for(int i=0;i<q;i++){
        System.out.print(oddarr[i]+" ");
    }
    //System.out.println("Sum of the second largest:"+(oddarr[-2]+evenarr[-2]));
   }
}
