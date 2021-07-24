package com.pengkang.sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        Integer[] a = {2,4,5,1,8,3,0,9};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }

    //比较方法
    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
        //int res = v.compareTo(w); res>0 ,true;
    }

    // 交换值；
    private static void swap(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //核心sort 方法里面调用前两个方法，每次选择完，少一个数字参与 选择，
    //剩余两个元素不需要选择，留在原地就行
    //On2,
    public static void sort(Comparable[] a){
        for(int i= 0; i< a.length -2; i++){
            //记录最小元素的索引，默认第一个
            int minIndex = i;
            for(int j = i+1; j< a.length-1;j++){
                if(greater(a[minIndex],a[j])){
                    minIndex = j;
                }

            }

            swap(a, i, minIndex);
        }

    }
}
