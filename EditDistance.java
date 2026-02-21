import java.util.*;

class EditDistance {
    public int minDistance(String word1, String word2) {
        int m=word1.length(),n=word2.length();
        int[] dp=new int[n+1];
        for(int j=0; j<=n; j++) dp[j]=j;
        for(int i=1; i<=m; i++) {
            int p=dp[0];    // dp[i-1][0]
            dp[0]=i;
            for(int j=1; j<=n; j++) {
                int t=dp[j];    // 上を保存
                if(word1.charAt(i-1)==word2.charAt(j-1)) dp[j]=p;   // 左上
                else {
                    dp[j]=Math.min(
                            Math.min(dp[j],dp[j-1]),p   // 上・左
                            )+1;                        // 左上
                }
                p=t;    // 左上更新
            }
        }
        return dp[n];
    }
}
