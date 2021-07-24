package com.pengkang.binarysearch.sortedArray;

public class L153 {
}
class Solution {
    public int findMin(int[] nums) {
        if(nums == null)return -1;
        int left = 0, right = nums.length -1;

        while(left <= right) {
            int mid = left + (right -left)/2;
            //Beautiful!. I was comparing nums[mid] > nums[left] instead and my code does not work.
            // Comparing with right instead of left is important.
            if(nums[right] <= nums [mid]){
                left = mid + 1;
            }else{
                right = mid ;
            }
        }
        return nums[right];//must right

    }
}