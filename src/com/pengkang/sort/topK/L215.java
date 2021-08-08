package pengkang.sort.topK;
//其中 partition 分区函数会任意选择一个元素（该解法中选择最后一个元素arr[len-1]）作为 pivot（分区点），将数组中小于 pivot 的点都放置到其左边，
// 将大于pivot的点都放置在其右边，最终 partition 函数返回 pivot 的下标 i
//        经过这一步骤后，数组将分成3部分
//        1、arr[0] ~ arr[i-1] 都是不大于 pivot 的元素
//        2、arr[i+1] ~ arr[len-1] 都是不小于 pivot 的元素
//        3、arr[i] 是 pivot 元素


public class L215 {

}


class Solution {

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int targetIndex = len - k;
        int low = 0, high = len - 1;
        while (true) {
            int i = quickSort(nums, low, high);


//            1、当 partition 函数返回的下标 i=len-k，则 arr[i] 就是我们要求的第K大元素
//            2、当 partition 函数返回的下标 i<len-k，那么说明第K大元素在下标 i 的右边，我们继续分区在 arr[i+1, len-1] 区间内查找：partition(arr, i+1, len-1)
//            3、当 partition 函数返回的下标 i>len-k，那么说明第K大元素在下标 i 的左边，我们继续分区在 arr[0, i-1] 区间内查找：partition(arr, 0, i-1)
//
//            该方法的时间复杂度是O(n)

            if (i == targetIndex) {
                return nums[i];
            } else if (i < targetIndex) {
                low = i + 1;
            } else {
                high = i - 1;
            }
        }
    }

    /**
     * 分区函数，将 nums[start] 作为 flag锚点
     * 一左，一右，两个指针，遍历数组，左边找比第一个数大的，右边找比flag小的，{左大右小}找到了就立马交换{左小右大}
     * 直到遍历指针相等，left == right , 这时候 将nums[i]和 flag 进行交换，返回下标 i，就是分区点的下标。
     */
    public int quickSort(int[] nums, int start, int end){
//        if(start >= end){
//            return;
//        }不需要递归
        int left = start;
        int right = end;

        int flag = nums[start];
        while(left < right){
            while(left < right && nums[right] >= nums[start]){
                right--;//                    >=

            }
            while(left < right && nums[left] <= nums[start]){
                left++;
            }
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
        //left == right
        nums[start] = nums[right];//nums[start] = nums[left];
        nums[right] = flag;
        return left;//return right;

//        quickSort(nums, start, left-1);
//        quickSort(nums,left+1,end);

    }

//    private void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }
}
