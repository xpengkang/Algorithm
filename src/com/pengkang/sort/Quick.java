package com.pengkang.sort;

public class Quick {



    private  static void swap(Comparable[] a, int i, int j){

        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;


    }

    private static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;//x<y，true
    }

    public static void sort(Comparable[] a){
        //辅助数组，用三个指针来归并，然后复制回到原数组
        int low = 0;
        int high = a.length -1;
        sort(a,low,high);//对所有的元素进行排序



    }

    public static void sort(Comparable[] a, int low, int high){
        if(low >= high){
            return;
        }
        int part = partition(a,low,high);//分界，变换后的索引

        //分组，左子组low,part,有序，右子组有序，part,high
        sort(a,low,part-1);
        sort(a,part+1, high);




    }

    /**
     * 核心代码，
     * @param a
     * @param low
     * @param high
     * @return
     */
    public static int partition(Comparable[] a, int low, int high){
        //确定分界值
        Comparable key = a[low];
        int left= low;
        int right = high+1;

        while (true){
            //右往左，找到比分界值小的，停止
            while (less(key,a[--right])){
                //秒啊，因为int right = high+1;然后自动左移
                if(right == low){
                    break;
                }
            }

            //左往右，找到比分界值大的，停止
            while (less(a[++right],key)){
                //秒啊，因为int right = high+1;然后自动右移
                if(left == high){
                    break;
                }
            }

            //left >= right，结束扫描
            if(left >= right){
                break;
            }else{
                swap(a,left, right);
            }

        }

        swap(a, low, right);//把第一个值交换到分界位置；
        return right;//返回分界值



    }


}
