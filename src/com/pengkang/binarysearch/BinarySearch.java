package pengkang.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        //test
        int[] arr = {1,3,4,5,6,23,45,67,78,99};
        int index = binarySearch(arr, 1);

        System.out.println("index = " + index);//打印出来
        int index2 = binarySearch(arr, 100);
        System.out.println(index2);//运行之

    }

    //二分查找的非递归实现

    /**
     *
     * @param arr 要查找的数组
     * @param target 查找目的值
     * @return
     */
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid]==target){
                return mid;//这里有一个返回return
            }else if(arr[mid]>target){
                right = mid -1;//往左边查找
            }else {//在右边
                left = mid + 1;
            }
        }
        //return left;
        return -1;//为什么不是上面那个

    }
}
