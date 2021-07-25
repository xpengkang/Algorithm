public class L3{
    
}

// 滑动窗口
// 时间复杂度: O(len(s))
// 空间复杂度: O(len(charset))
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int l = 0 , r = -1;
        int res = 0;
        
        // 整个循环从 l == 0; r == -1 这个空窗口开始
        // 到l == s.size(); r == s.size()-1 这个空窗口截止
        // 在每次循环里逐渐改变窗口, 维护freq, 并记录当前窗口中是否找到了一个新的最优值
        while(l < s.length()){
            //改变滑动窗口
            if(r+1 < s.length() && freq[s.charAt(r+1)]==0){
                r++;
                freq[s.charAt(r)]++;
                
            }//r已经到头 || freq[s[r+1]] == 1
            else{//缩小窗口
                freq[s.charAt(l)] --;
                l++;
                
            }
            //比较结果
            res = Math.max(res, r-l +1);
        }
        return res;
    }
}