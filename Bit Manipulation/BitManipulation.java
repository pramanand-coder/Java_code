public class BitManipulation{
    public static void main(String[] args){
        int num1=13;    //1101
        int num2=-13;
        System.out.println(num1 & 8);     //1101 & 1000 ->1000-8
        System.out.println(num1 | 2);     //1101 | 0010 ->1 -14
        System.out.println(~num1);       //1101 -> 
        System.out.println(~num2);
        System.out.println(num1 ^ 8);    //1101 ^ 1000 ->0101 -5
        //changing the msb bit
        int x=16;
        int mask=1<<31;
        x=x | mask;
        System.out.println("x is "+x);

        int y=-67;
        mask=~mask;
        y=y & mask;
        System.out.println("y is "+y);

        
    }
}