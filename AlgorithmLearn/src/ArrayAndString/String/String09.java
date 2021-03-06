package ArrayAndString.String;

/**
 * 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 *
 */
public class String09 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen=0;
        int tempLen=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1) tempLen++;
            else {
                if (tempLen>maxLen) maxLen=tempLen;
                tempLen=0;
            }
        }
        if (tempLen>maxLen) maxLen=tempLen;
        return maxLen;
    }
}
