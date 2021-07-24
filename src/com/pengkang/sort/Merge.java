package com.pengkang.sort;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        //test
        int[] a= {4,1,5,3,9,0,2,190,23,45,12};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));

    }


    /*
    5个成员方法，三个是一样的，和前面的排序
     */

    /**
     * 对数组中元素排序
     * @param a
     */

    public static void sort(int[] a){
        //辅助数组，用三个指针来归并，然后复制回到原数组

        int low = 0;
        int high = a.length -1;
        //重载sort方法
        sort(a, 0, a.length -1);

    }

    /**
     * 对数组a,两个索引之间进行排序
     * @param a
     * @param low
     * @param high
     */
    private static void sort(int[] a, int low, int high){
        //安全校验
        if(low >= high){
            return;
        }



        int mid = low + (high - low)/2;
        //递归一直分组排序
        sort(a, low, mid);
        sort(a, mid+1, high);

        // 排好序了，归并,核心
        merge(a, low,high);//mid,没有用到
    }

    /**
     * 对数组中元素归并
     * @param a
     * @param low
     * @param
     * @param high
     */
    private static void merge(int[] a, int low, int high){
        //核心，
        //遍历， p1,p2，比较，
        int i = low;
        int mid = (low + high )/2;

        int p1 = low;
        int p2 = mid+1;


        int[] assist = new int[high -low +1];
        while(p1 <= mid&& p2<= high){
            if(a[p2] > a[p1]){
                assist[i++] = a[p1++];//这个秒啊，i ++ .
                // asist[i] = a[p1];i++;p1++

            }else{
                assist[i++] = a[p2++];
            }

        }

        //遍历p1, 不知道p1,p2,谁先结束；
        //遍历p2, 不知道p1,p2,谁先结束；这俩个循环只会走一个
        while(p1 <= mid){
            assist[i++]=a[p1++];
        }
        while(p2 <= high){
            assist[i++]=a[p2++];
        }

        // 复制到原数组中；

        for (int n = 0; n < assist.length ; n++) {
            a[n+low] = assist[n];

        }








    }

    /**
     * 比较大小的方法
     * @param x， comparable数组中的元素,a[i]
     * @param y
     * @return
     */
//    private static boolean less(Comparable x, Comparable y){
//        return x.compareTo(y) < 0;//x<y，true
//    }

    /**
     * 交换的方法
     * @param a，Comparable数组
     * @param i，索引
     * @param j，索引
     */
//    private  static void swap(Comparable[] a, int i, int j){
//
//        Comparable temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//
//
//    }
}
