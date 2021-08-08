package pengkang.sort.topK;

import java.util.PriorityQueue;

/**
 * topK 问题的第二种解法
 * 时间复杂度：O(NlogK)，遍历数据 O(N)O(N)，堆内元素调整 O(K)O(K)；
 * 空间复杂度：O(K)。
 */

//优先队列
//由于找第 K 大元素，其实就是整个数组排序以后后半部分最小的那个元素。因此，我们可以维护一个有 K 个元素的最小

class Solution215 {

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;


// 使用一个含有 k 个元素的最小堆
        PriorityQueue<Integer> minHeap = new PriorityQueue(k);

        for(int i = 0; i< k ;i++){
            minHeap.offer(nums[i]);
        }
// 只要当前遍历的元素比堆顶元素大，堆顶弹出，遍历的元素进去
        for(int j = k ; j < len; j++){
            if(nums[j] > minHeap.peek()){
                //说明不是在最大的。k个
                minHeap.poll();
                minHeap.offer(nums[j]);
            }
        }

        return minHeap.peek();


    }

}
