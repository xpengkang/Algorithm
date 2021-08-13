public class L88 {
}
class Solution88 {


    // space O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length -1;

        int i = m-1, j = n-1;
        while(i>=0 && j>=0 && i < m && j < n){//i>=0 && j>=0 防止数组越界

            if(nums1[i] >= nums2[j]){
                nums1[len--] = nums1[i--];
            }else{
                nums1[len--] = nums2[j--];
            }
        }

        while(i>=0 && i< m){
            nums1[len--] = nums1[i--];
        }

        while(j>=0 && j< n){
            nums1[len--] = nums2[j--];
        }
        return;
    }


}