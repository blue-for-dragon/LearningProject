package BinarySearn;

public class binary05_153 {
    /**
     * 153. 寻找旋转排序数组中的最小值
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] 。
     *
     * 请找出其中最小的元素。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [3,4,5,1,2]
     * 输出：1
     * 示例 2：
     *
     * 输入：nums = [4,5,6,7,0,1,2]
     * 输出：0
     * 示例 3：
     *
     * 输入：nums = [1]
     * 输出：1
     *
     *
     * 提示：
     *
     * 1 <= nums.length <= 5000
     * -5000 <= nums[i] <= 5000
     * nums 中的所有整数都是 唯一 的
     * nums 原来是一个升序排序的数组，但在预先未知的某个点上进行了旋转
     */
    public int findMin(int[] nums) {
        int len=nums.length;
        int left=0,right=len-1;

        while(left<right){
            int mid=left+(right-left)/2;
            //3 4 5 1 2
            if (nums[mid]>nums[right]){
                //中间大于右边界  左边一定不存在最小值  且中间值也一定不是最小值
                left=mid+1;
            }else{
                //12345  67345 中间小于右边界  必不可能等于
                //且有可能中间就是最小值
                right=mid;
            }
        }
        return nums[left];
    }
}
