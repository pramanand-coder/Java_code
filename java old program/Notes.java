import java.util.*;
class Notes{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount:");
    int num=sc.nextInt();
    int count=0;
    while(num>0){
        if(num>=2000){
            count+=num/2000;
            num=num%200;
        }
        else if(num>=500){
            count+=num/500;
            num=num%500;
        }
        else if(num>=200){
            count+=num/200;  
            num=num%200;
        }
        else if(num>=100){
            count+=num/100;  
            num=num%100;
        }
        else if(num>=50){
            count+=num/50;  
            num=num%50;
        }
        else if(num>=20){
            count+=num/20;  
            num=num%20;
        }
        else if(num>=10){
            count+=num/10;  
            num=num%10;
        }
        else if(num>=5){
            count+=num/5;  
            num=num%5;
        }
        else if(num>=2){
            count+=num/2;  
            num=num%2;
        }
        else{
            count+=num;
            num=num%1;
        }
    }
    System.out.println("Minimum Number of Notes:"+count);
   }
}
