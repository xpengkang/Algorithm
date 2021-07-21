package com.ucas.binarysearch.sortedArray;

public class L81 {
}

/**
 * 元素可以重复。当nums[left] == nums[mid]时，
 * 无法判断 target 位于左侧还是右侧，此时无法缩小区间，退化为顺序查找
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array II.
 */
class Solution1 {
    public boolean search(int[] nums, int target) {
        for(int k:nums){
            if(k == target){
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public boolean search(int[] nums, int target) {
        if(nums == null)return false;
        int left = 0, right = nums.length -1;

        /*
        边界条件两种写法，对应不同的返回值
        while(left < right),return nums[left]==target?left:-1;
        while(left <= right),return 1;
         */
        while(left <= right) {
            int mid = left + (right -left)/2;
            if(nums[mid] == target) {
                return true;
            }

            if(nums[right] == nums[mid]){
                right--;
                continue;//终段这次循环，进入下一个while
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
        return false;
        //return nums[left]==target?left:-1;
    }
}