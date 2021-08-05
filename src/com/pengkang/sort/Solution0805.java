package pengkang.sort;

public class Solution0805 {

    public static void main(String[] args) {
        Solution0805 s = new Solution0805();
        s.quickSort(new int[]{12,32,1,2,3,54,34,23,43,12,33,99,0,7});
    }

    public int[] quickSort(int[] a){
        partition(a, 0, a.length -1);
        return a;
    }

    private void partition(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int i = start, j = end;
        int pivot = nums[start];

        while(i<j){
            if(nums[i] <= pivot){
                i++;
            }
            if(nums[j] >= pivot){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        nums[start] = nums[j];
        nums[j] = pivot;

        partition(nums, i+1, end);
        partition(nums, 0,i-1);
    }
}
