package com.pengkang.test;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,1,23,2,3,4,5,6,7,8,9,0,9,8,7,7,0,123,45,65,45,34,56};
        Main.mergeSort(nums1);
        for (int a:nums1
             ) {
            System.out.print(a);
            System.out.print(" <or= ");
        }
        System.out.println();
    }
    public static int[] mergeSort(int[] nums){
        mergeSort(nums, 0, nums.length -1);
        return nums;//这里要有返回值
    }

    public static void mergeSort(int[] nums, int start, int end){
        //递归截止条件
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;
        //递归
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums,start, end);
    }

    static void merge(int[] nums, int start, int end){
        //temp数组大小有讲究
        int[] temp = new int[end - start + 1];
        int mid = (start + end)/2;

        //双指针的意义
        int i = start,j = mid + 1;
        int k = 0;
        //关键
        while(i<= mid && j<=end){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        //<=
        while(i <= mid){

            temp[k++] = nums[i++];
        }
        while(j <= end){

            temp[k++] = nums[j++];
        }

        //这里是temp.length， * l + start
        for (int l = 0; l < temp.length; l++) {
            nums[l+start] = temp[l];
        }


    }


    /*
    快排
     */

}
