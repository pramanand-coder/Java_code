public class FileVersion {
    public static int fileVersion(String[] arr,int n){
        if(n==0){
            return -1;
        }
        int maxi=-1;
        for(String s:arr){
            if(s.substring(0,5).equals("File_")){
                maxi=Math.max(maxi,Integer.parseInt(s.substring(5)));
            }
        }
        return maxi;
    }
    public static void main(String... args){
        String[] arr1={"File_3","File_2","File_4","File_1"};
        String[] arr2={"File_3","File_2","file_4","File_1"};
        String[] arr3={};
        int ans=fileVersion(arr2,arr2.length);
        System.out.println("Maximum file version:"+ans);
    }
}
