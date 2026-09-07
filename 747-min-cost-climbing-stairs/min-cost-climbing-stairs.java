class Solution {
    public int minCostClimbingStairs(int[] cost) {
         int dp[]=new int[cost.length+1];
        if(cost.length==2)
        {
            return Math.min(cost[0],cost[1]);
        } 
        else
        {
            dp[0]=0;
            dp[1]=0;
            dp[2]=Math.min(cost[0],cost[1]);
            for(int i=3;i<dp.length;i++)
            {
                dp[i]=Math.min(cost[i-2]+dp[i-2],cost[i-1]+dp[i-1]);
            }
            return dp[cost.length];
        }
        
    }
}