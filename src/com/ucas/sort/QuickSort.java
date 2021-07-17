package com.ucas.sort;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int[] num = {1,43,23,12,1,56,43,0,78};
        QuickSort s = new QuickSort();
        int[] res = s.quickSort(num);
        System.out.println(Arrays.toString(res));

    }
    //手撕快排



    public int[] quickSort(int[] nums){

        quickSort(nums,0, nums.length -1);
        return nums;

    }

    public void quickSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int left = start;
        int right = end;

        int flag = nums[start];
        while(left < right){
            while(left < right && nums[right] >= nums[start]){
                right--;//                    >=

            }
            while(left < right && nums[left] <= nums[start]){
                left++;
            }
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

        }

        nums[start] = nums[right];
        nums[right] = flag;

        quickSort(nums, start, left-1);
        quickSort(nums,left+1,end);

    }

}
