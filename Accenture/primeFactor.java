import java.util.*;
public class primeFactor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> prime=new ArrayList<>();
        while(num%2==0){
            prime.add(2);
            num=num/2;
        }
        for(int i=3;i<Math.sqrt(num)+1;i+=2){
            while(num%i==0){
                prime.add(i);
                num=num/i;
            }
        }
        if(num>2){
            prime.add(num);
        }
        System.out.println(prime);
    }
}
