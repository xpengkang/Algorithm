//sort
//
//口诀：
//选择希尔快排堆，其他排序稳如狗

/**
     * 冒泡排序
     *j < array.length - 1 - i
     * @param array
     * @return
     */
//    public static int[] bubbleSort(int[] array) {
//        if (array.length == 0)
//            return array;
//        for (int i = 0; i < array.length; i++)
//            for (int j = 0; j < array.length - 1 - i; j++)
//                if (array[j + 1] < array[j]) {
//                    int temp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//                }
//        return array;
//    }
//
//
//
//每次选择最小的，放在合适的位置，
//第一次选择最小的，放在第一个
//
//选择第二小的，放在第二个
//int j = i; j < array.length; j++
//
//
//minIndex = j; //将最小数的索引保存
//
///**
//     * 选择排序
//
//     * @param array
//     * @return
//     */
//    public static int[] selectionSort(int[] array) {
//        if (array.length == 0)
//            return array;
//        for (int i = 0; i < array.length; i++) {
//            int minIndex = i;
//            for (int j = i; j < array.length; j++) {
//                if (array[j] < array[minIndex]) //找到最小的数
//                    minIndex = j; //将最小数的索引保存
//            }
//            int temp = array[minIndex];
//            array[minIndex] = array[i];
//            array[i] = temp;
//        }
//        return array;
//    }
//
//
//
//
//
//扑克牌，已排序和未排序的两种。。。
//默认0出是已排序的，未排序的第一个倒叙遍历已排序的，比较
//for(int i = 1; i<a.length; i++){
//            //内循环，倒叙遍历
//            for(int j = i; j> 0; j--){
//                //比较j,j-1,
//                if(a[j-1]>a[j])){
//                    swap(a, j-1,j);
//                }else{
//                    break;
//                }
//            }
//        }
//
//
//减少插入次数，
//分组
//缩小分组
//
//
//
//public static void sort(Comparable [] a){
//        int h = 1;
//        //确定h
//        while(h< 5){
//            h= 2*h +1;
//        }
//
//
//        while(h>=1){
//            //
//            for(int i = h; i< a.length;i++){
//                for(int j = i; j>=h;j-=h){
//                    if(greater(a[j-h], a[j])){
//                        //交换
//                        swap(a, j-h, j);
//                    }else{
//                        break;
//                    }
//                }
//            }
//
//
//
//            h= h/2;
//        }
//
//
//    }
//
//
//快速排序的思想很简单，就是确定一个「锚点」元素，将数组中所有小于锚点元素的放在一边，大于锚点元素的放在另一边，递归进行，直到排序结束。代码与注释如下：
//public int[] quickSort(int[] nums) {
//    quickSort(nums, 0, nums.length-1);
//    return nums;
//}
//public void quickSort(int[] nums, int start, int end) {
//    if(start>=end)
//        return;
//    int i=start, j=end;
//    //设置锚点元素
//    int flag = nums[start];
//    while(i<j){
//        //注意下面两个循环不能搞反，会存在锚点元素不能交换的问题
//        while(i<j && nums[j]>=flag)
//            j--;
//        while(i<j && nums[i]<=flag)
//            i++;
//        //交换元素
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//
//    }
//    //交换锚点元素至临界位置
//    nums[start] = nums[j];
//    nums[j] = flag;
//    //递归调用
//    quickSort(nums, start, i-1);
//    quickSort(nums, i+1, end);
//}
//
//
//
//三个指针，把归并好的放入辅助数组中；
//比较p1,p2, 小的后移
//I 后移，
//
//public int[] mergeSort(int[] nums) {
//    mergeSort(nums, 0, nums.length-1);
//    return nums;
//}
//public void mergeSort(int[] nums, int start, int end){
//    if(start>=end)
//        return;
//    //选择锚点元素
//    int mid = (start + end)/2;
//    //递归调用
//    mergeSort(nums, start, mid);
//    mergeSort(nums, mid+1, end);
//    //做合并操作
//    merge(nums, start, end);
//}
//public void merge(int[] nums, int start, int end){
//    int[] temp = new int[end-start+1];
//    int mid = (start+end)/2;
//    int i=start, j=mid+1;
//    int k=0;
//    //合并两个有序数组
//    while(i<=mid && j<=end){
//        if(nums[i]<nums[j])
//            temp[k++]=nums[i++];
//        if(nums[j]<=nums[i])
//            temp[k++]=nums[j++];
//    }
//    //把左边剩余的数移入数组
//    while(i<=mid)
//        temp[k++]=nums[i++];
//    //把右边剩余的数移入数组
//    while(j<=end)
//        temp[k++]=nums[j++];
//    //赋值给原数组
//    for(int n=0;n<temp.length;n++){
//        nums[n+start]=temp[n];
//    }
//}
//
//堆排序
////声明全局变量，用于记录数组array的长度；
//static int len;
//    /**
//     * 堆排序算法
//     *
//     * @param array
//     * @return
//     */
//    public static int[] HeapSort(int[] array) {
//        len = array.length;
//        if (len < 1) return array;
//        //1.构建一个最大堆
//        buildMaxHeap(array);
//        //2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
//        while (len > 0) {
//            swap(array, 0, len - 1);
//            len--;
//            adjustHeap(array, 0);
//        }
//        return array;
//    }
//    /**
//     * 建立最大堆
//     *
//     * @param array
//     */
//    public static void buildMaxHeap(int[] array) {
//        //从最后一个非叶子节点开始向上构造最大堆
//        for (int i = (len/2 - 1); i >= 0; i--) { //感谢 @让我发会呆 网友的提醒，此处应该为 i = (len/2 - 1)
//            adjustHeap(array, i);
//        }
//    }
//    /**
//     * 调整使之成为最大堆
//     *
//     * @param array
//     * @param i
//     */
//    public static void adjustHeap(int[] array, int i) {
//        int maxIndex = i;
//        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
//        if (i * 2 < len && array[i * 2] > array[maxIndex])
//            maxIndex = i * 2;
//        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
//        if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex])
//            maxIndex = i * 2 + 1;
//        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
//        if (maxIndex != i) {
//            swap(array, maxIndex, i);
//            adjustHeap(array, maxIndex);
//        }
//    }
//参考：
//https://www.cnblogs.com/guoyaohua/p/8600214.html
//https://mp.weixin.qq.com/s/pD6rAaggV3ktbZ9MVoT8QA