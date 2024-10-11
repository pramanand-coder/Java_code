public class VowelPermutation {
    public static int vowelPermutation(String s){
        if(s.length()==0){
            return 0;
        }
        String vowel="aeiouAEIOU";
        int vowelCnt=0;
        int consonantCnt=0;
        int ans=1;
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)!=-1){
                vowelCnt+=1;
            }
            else{
                consonantCnt+=1;
            }
        }
        if(vowelCnt!=s.length()){
        for(int i=2;i<=consonantCnt;i++){
            ans*=i;
        }
        }
        else{
            return 0;
        }
        return ans;
    }
    public static void main(String[] args){
        String s="ABC";
        String s1="CDF";
        String s2="Jyoti";
        String s3="AE";
        int ans=vowelPermutation(s3);
        System.out.println("Output="+ans);
    }
}
