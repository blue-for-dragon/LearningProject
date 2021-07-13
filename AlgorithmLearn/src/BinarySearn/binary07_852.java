package BinarySearn;

public class binary07_852 {
    /**
     * 852. 山脉数组的峰顶索引
     * 符合下列属性的数组 arr 称为 山脉数组 ：
     * arr.length >= 3
     * 存在 i（0 < i < arr.length - 1）使得：
     * arr[0] < arr[1] < ... arr[i-1] < arr[i]
     * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
     * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：arr = [0,1,0]
     * 输出：1
     * 示例 2：
     *
     * 输入：arr = [0,2,1,0]
     * 输出：1
     * 示例 3：
     *
     * 输入：arr = [0,10,5,2]
     * 输出：1
     * 示例 4：
     *
     * 输入：arr = [3,4,5,1]
     * 输出：2
     * 示例 5：
     *
     * 输入：arr = [24,69,100,99,79,78,67,36,26,19]
     * 输出：2
     */
    //1.暴力 o(n)
    public int peakIndexInMountainArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
                if(arr[i]>arr[i+1])
                    return i;
        }
        return -1;
    }
    //2.二分  利用中点与中点下一个点比较  逐渐缩小搜索区间
    public int peakIndexInMountainArray1(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if (arr[mid]<arr[mid+1]){
                //可能mid+1是峰值
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}