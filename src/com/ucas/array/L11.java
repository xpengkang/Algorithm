public class L11{
    
}


class Solution {
    public int maxArea(int[] height) {
        // int left = 0, right = height.length-1;
        // int max = 0;
        // int area =0;
        // while (left != right){
        //     if(height[left]>height[right]){
        //         area = height[right]*(right-left);
        //         left++;
        //     }else if(height[left]==height[right]){
        //         area = height[left]*(right-left);
        //         left++;
        //         right--;
        //     }else{
        //         area = height[left]*(right-left);
        //         right--;
        //     }
        //     max = Math.max(max,area);
        // }
        // return max;
        int maxArea = 0;
        
        int left = 0;
        int right = height.length - 1;
        
        int maxHeight = 0;
        
        while (left < right) {
            // because the length is always decreasing
            // we only need to consider a pair if its height
            // is greater than any pair's height we've used so far
            if (height[left] > maxHeight && height[right] > maxHeight) {
                maxHeight = Math.min(height[left], height[right]);
                maxArea = Math.max(maxArea, maxHeight * (right - left));
            }
            
            // move pointers
            if (height[left] == height[right]) {
                left ++;
                right --;
            } else if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }
        }
        
        return maxArea;
    }
}



// class Solution(object):
//     def maxArea(self, height):
//         """
//         :type height: List[int]
//         :rtype: int
//         """
//         MAX = 0 
//         x = len(height) - 1
//         y = 0
//         while x != y:
//             if height[x] > height[y]:
//                 area = height[y] * (x - y)
//                 y += 1
//             else:
//                 area = height[x] * (x - y)
//                 x -= 1
//             MAX = max(MAX, area)
//         return MAX
