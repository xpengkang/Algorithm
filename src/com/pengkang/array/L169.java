package com.pengkang.array;

public class L169 {

    public static <String> void main(String[] args){
        L169 l = new L169();

       // System.out.printlnew int[]{1,3,2,3,2,3}));
    }



        public int majorityElement(int[] nums) {
            int res = nums[0];
            int count = 0;
            for(int i = 0; i < nums.length; ++i){
                if(nums[i]== res){
                    count++;
                }else{
                    count--;
                    res = nums[i+1];//后移一位
                }
            }
            return res;
        }


}
