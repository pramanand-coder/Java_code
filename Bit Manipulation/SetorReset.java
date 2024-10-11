import java.util.*;
public class SetorReset {
    public static String Check(int num,int pos){
        int mask=1<<pos;
        num=num & mask;
        if(num>0){
            return "Set";
        }
        return "Reset";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter the position:");
        int pos=sc.nextInt();
        System.out.println(Check(num,pos));
        
    }
}
