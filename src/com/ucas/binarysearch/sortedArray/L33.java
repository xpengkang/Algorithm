package com.ucas.binarysearch.sortedArray;

public class L33 {
}

/**
 *
 * https://mp.weixin.qq.com/s/u2DhUGa8rkuZmV2djE1rtA
 * 感谢这个大佬的题解
 * 若target == nums[mid]，直接返回
 * 若nums[left] <= nums[mid]，说明左侧区间 [left,mid]「连续递增」。此时：
 * 若nums[left] <= target <= nums[mid]，说明 target 位于左侧。令right = mid-1，在左侧区间查找。
 * 否则，令left = mid+1，在右侧区间查找
 * 若nums[left] >= nums[mid]，说明右侧区间 [mid,right]「连续递增」。此时：
 * 若nums[mid] <= target <= nums[right]，说明 target 位于右侧区间。令left = mid+1，在右侧区间查找
 * 否则，令right = mid-1，在左侧区间查找
 */
class Solution {
    public int search(int[] nums, int target) {
        if(nums == null)return -1;
        int left = 0, right = nums.length -1;

        /*
        边界条件两种写法，对应不同的返回值
        while(left < right),return nums[left]==target?left:-1;
        while(left <= right),return 1;
         */
        while(left < right) {
            int mid = left + (right -left)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[left] <= nums [mid]){//[left,mid] 连续递增,这里一定要是<=, 没有等号报错
                if(nums[left] <= target && target < nums[mid]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }else{
                if(nums[right] >= target && target > nums[mid]){
                    left = mid +1;
                }else{
                    right = mid - 1;
                }
            }
        }
        //return -1;
        return nums[left]==target?left:-1;
    }
}

