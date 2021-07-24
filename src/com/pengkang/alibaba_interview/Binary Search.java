package com.pengkang.alibaba_interview;

//二分查找，平方根
// mid*mid  > x ，这种写法时间超出限制
class Binary_Search {

}


class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int hight = x;
        int res = 0;
        if (x == 0)return 0;
        
        while(hight >= low){
            int mid = (hight + low)/2;
            if(mid  > x/mid){
                hight =mid-1;
            }else if(mid  <= x/mid){
                low =mid+1;
                res = mid;
            }
        }
        
        return res;
     
    }
}