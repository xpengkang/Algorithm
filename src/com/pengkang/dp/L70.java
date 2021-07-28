class Solution70 {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n<=1)return 1;
        if(n==2)return 2;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;


        for(int i = 3 ; i<=n; i++){
            // dp[n] = dp[n-1]+dp[n-2];//记忆化搜索
            dp[i] = dp[i-1] + dp[i - 2];//注意是dp[i], 用memo 来记忆，不需要递归。重叠子结构
        }
        return dp[n];
    }
}