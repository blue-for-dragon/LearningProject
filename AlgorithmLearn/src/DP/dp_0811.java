package DP;

public class dp_0811 {
    /**
     * 面试题 08.11. 硬币
     * 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
     *
     * 示例1:
     *
     *  输入: n = 5
     *  输出：2
     *  解释: 有两种方式可以凑成总金额:
     * 5=5
     * 5=1+1+1+1+1
     * 示例2:
     *
     *  输入: n = 10
     *  输出：4
     *  解释: 有四种方式可以凑成总金额:
     * 10=10
     * 10=5+5
     * 10=5+1+1+1+1+1
     * 10=1+1+1+1+1+1+1+1+1+1
     *
     * 时间O(4*(n+1))
     * 空间O(n+1)
     */
    public int waysToChange(int n) {
        int nums[]=new int[]{1,5,10,25};
        int dp[]=new int[n+1];
        dp[0]=1;
        for (int i=0;i<nums.length;i++){
            for (int j=nums[i];j<=n;j++){
                dp[j]=(dp[j]+dp[j-nums[i]])%1000000007;
            }
        }
        return dp[n];
    }
}
