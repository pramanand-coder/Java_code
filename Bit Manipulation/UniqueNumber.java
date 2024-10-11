public class UniqueNumber {
    public static int uniqueNumber(int[] arr){
        int res=0;
        for(int x:arr){
            res=res^x;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr={5,2,7,8,5,2,9,7,6,4,6,4,8};
        int n=uniqueNumber(arr);
        System.out.println("unique number:"+n);
    }
}
