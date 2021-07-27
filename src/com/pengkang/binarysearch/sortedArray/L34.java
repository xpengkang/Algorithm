//we can just simply apply to binary search twice to find each index of the target element.

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null){
            return new int[]{-1,-1};
        }        
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
     
    }
    private int findFirst(int[] nums, int target){
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) idx = mid;
    }
    return idx;
    }

private int findLast(int[] nums, int target){
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] <= target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
        if(nums[mid] == target) idx = mid;
    }
    return idx;
    }
//     public int findFirst(int[] nums, int target) {
//         int left = 0, right = nums.length -1;
//         while(left<=right){
//             int mid = left + (right -left)/2;
//             if(nums[mid] >= target){
//                 right = mid - 1;
//             }else{
//                 left = mid;
//             }
            
//             if(nums[mid] == target) return mid;
//         }
//         return -1;
//     }
//     public int findLast(int[] nums, int target) {
//         int left = 0, right = nums.length -1;
//         while(left<=right){
//             int mid = left + (right -left)/2;
//             if(nums[mid] <= target){
//                 left = mid + 1;
//             }else{
//                 right = mid;
//             }
            
//             if(nums[mid] == target) return mid;
//         }
//         return -1;
//     }
}