package com.pengkang.sort;

public class MergeSort {

    public static void main(String[] args) {
        //手撕
    }

    public int[] mergeSort(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        mergeSort(nums, low, high);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right){
        if(left >= right){
            return;
        }

        int mid = left + (right - left)/2;
        mergeSort(nums,left, mid);
        mergeSort(nums,mid+1, right);

        merge(nums, left, right);
    }

    public void merge(int[] nums, int left, int right){
        int[] temp = new int[right-left +1];
        int mid = (left+right)/2;
        int i = left;
        int j = right;
        int k = 0;

        while(i<=mid && j<= right){
            if(nums[i]< nums[j]){
                temp[k++]= nums[i++];
            }
            else {
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid){
            temp[k++]= nums[i++];
        }
        while(j<=right){
            temp[k++]= nums[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            nums[l + left] = temp[l];//
        }
    }



}
