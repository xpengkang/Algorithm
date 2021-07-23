/**
 * 
 * L55
 * 
 */
class Solution55 {
    public boolean canJump(int[] nums) {
        int cur = 0;
        for(int i = 0; i< nums.length; i++){
            if(cur< i)return false;
            cur = Math.max(cur, i + nums[i]);
        }
        return true;
        
    }
}

// The main idea is based on greedy. 
// Let's say the range of the current jump is [curBegin, curEnd], 
// curFarthest is the farthest point that all points in [curBegin, curEnd] can reach.
// Once the current point reaches curEnd, then trigger another jump, and set the new curEnd with curFarthest, 
class Solution45 {
    public int jump(int[] nums) {
        int jumps=0,end=0,fastend=0;
        for(int i =0; i<nums.length-1;i++){
            fastend= Math.max(fastend,i+nums[i]);
            if(i==end){
                jumps++;
                end=fastend;
            }
            
            //跳出，已经不必要再走后面的循环
            if(end >= nums.length-1){
                break;
            }
        }
        return jumps;
    }
}