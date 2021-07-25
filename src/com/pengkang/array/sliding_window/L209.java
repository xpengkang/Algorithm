//O(n),O(1)
public class L209{
    
}
class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1;
        int sum = 0;
        int res = nums.length +1;
        
        while(l< nums.length){
            if(r+1 < nums.length && sum < s){
                r++;
                sum += nums[r];//r+1 < nums.length
            }else{
                sum -= nums[l];
                l++;
            }
            
            if(sum >= s){
                res = Math.min (res, r-l+1);
            }
        }
        if( res == nums.length +1){
            return 0;
        }
        return res;
    }
}