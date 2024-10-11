public class minimumKeyPresses {
   public static int minimumKeyPresses(String s){
      int n = s.length();
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;  // No key presses needed to start with 0

        for (int i = 1; i <= n; i++) {
            // Consider pressing one key
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);

            // Consider pressing "00"
            if (i >= 2 && s.substring(i - 2, i).equals("00")) {
                dp[i] = Math.min(dp[i], dp[i - 2] + 1);
            }
        }

        return dp[n];
   } 
   public static void main(String[] args){
    String a="678543";
    int count=minimumKeyPresses(a);
    System.out.println(count);
   }
}
